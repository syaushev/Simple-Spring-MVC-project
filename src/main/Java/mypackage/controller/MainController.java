package mypackage.controller;




import mypackage.dao.UserDAO;
import mypackage.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.slf4j.Logger;






@Controller
public class MainController {

    private final Logger log= LoggerFactory.getLogger(MainController.class);

    @Autowired
    private UserService userService;




    @RequestMapping(value = "/")
    public ModelAndView base(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("base");

        log.debug("ModelAndView has been set. It is "+modelAndView.getViewName());
        log.warn("This page should be changed");








        return modelAndView;
    }

    @RequestMapping(value = "training/hello")
    public  ModelAndView main(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");

        if(log.isDebugEnabled()){
            log.debug("ModelAndView has been set. It is "+modelAndView.getViewName());
        }

        userService.insertUser();



        return modelAndView;
    }

}
