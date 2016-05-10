package quiz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import quiz.model.Participant;
import quiz.service.AdminService;


import java.util.ArrayList;
import java.util.Map;



/**
 * Created by kafr on 18/02/2016.
 */

@Controller
public class HomeController {



    @Autowired
    private AdminService adminService;

    @RequestMapping(method=RequestMethod.GET, value="/panel")
    public ModelAndView addParticipant() {
        ModelAndView model = new ModelAndView("panel.jsp");
        Participant participant = new Participant();
        participant.setPhoto(null);
        participant.setHappenings(null);
        participant.setPointList(null);
        model.addObject("participant", participant);
        return model;
    }

    @RequestMapping(value = "/saveparticipant", method = RequestMethod.POST)
    public ModelAndView saveParticipant(@ModelAttribute Participant participant) {
        adminService.saveOrUpdate(participant);
        return new ModelAndView("redirect:/panel");
    }


    }


