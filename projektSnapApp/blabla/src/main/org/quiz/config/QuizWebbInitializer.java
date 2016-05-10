package quiz.config; /**
 * Created by kafr on 18/02/2016.
 */
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class QuizWebbInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { QuizRootConfig.class};

    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {QuizWebConfig.class};
    }

}
