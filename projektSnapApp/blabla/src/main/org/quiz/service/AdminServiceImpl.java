package quiz.service;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import quiz.model.Happening;
import quiz.model.Participant;


/**
 * Created by Kasia on 2016-05-08.
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void saveOrUpdate(Participant participant) {
        sessionFactory.getCurrentSession().saveOrUpdate(participant);
    }

    public Boolean checkLoginAndPassword(String login, String password) {
        return null;
    }

    public void AddANewParticipant(Participant participant) {



    }

    public void AddANewHappening(Happening happening) {

    }
}
