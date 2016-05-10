package quiz.service;


import quiz.model.Happening;
import quiz.model.Participant;

/**
 * Created by Kasia on 2016-05-08.
 */
public interface AdminService {

    public void saveOrUpdate(Participant participant);
    public Boolean checkLoginAndPassword(String login, String password);
    public void AddANewParticipant(Participant participant);
    public void AddANewHappening(Happening happening);

}
