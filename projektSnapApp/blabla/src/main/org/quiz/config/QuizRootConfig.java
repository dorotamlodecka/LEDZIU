package quiz.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import quiz.model.*;
import quiz.web.HomeController;

import javax.sql.DataSource;

/**
 * Created by kafr on 18/02/2016.
 */


@Configuration
@ComponentScan(basePackages = {"quiz"}
    //excludeFilters={
         //   @ComponentScan.Filter(type= FilterType.ANNOTATION, value= EnableWebMvc.class)
//}
)
public class QuizRootConfig {


private SessionFactory sessionFactory;

    public QuizRootConfig(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public QuizRootConfig() {}

    @Bean(name = "dataSource")
    public DataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres2");
        dataSource.setUsername("postgres");
        dataSource.setPassword("kasia");
        return dataSource;
    }


    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
        sessionBuilder.addAnnotatedClasses(Admin.class, Happening.class, Participant.class, Point.class);
        sessionBuilder.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL9Dialect");
        sessionBuilder.setProperty("hibernate.hbm2ddl.auto", "update");
        sessionBuilder.setProperty("hibernate.show_sql", "true");
        return sessionBuilder.buildSessionFactory();
    }


    @Bean(name = "transactionManager")
    public HibernateTransactionManager getTransactionManager(
            SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(
                sessionFactory);

        return transactionManager;
    }



}
