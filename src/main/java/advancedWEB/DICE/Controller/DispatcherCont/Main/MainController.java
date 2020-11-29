package advancedWEB.DICE.Controller.DispatcherCont.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView main(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Main/Intro");

        return mv;
    }
    @RequestMapping(value="/Ranking", method = RequestMethod.GET)
    public ModelAndView ranking(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Main/Ranking");

        return mv;
    }
    @RequestMapping(value="/Category", method = RequestMethod.GET)
    public ModelAndView category(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Main/Category");

        return mv;
    }
    @RequestMapping(value="/HowToSearch", method = RequestMethod.GET)
    public ModelAndView howtosearch(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Main/HowToSearch");

        return mv;
    }
}
