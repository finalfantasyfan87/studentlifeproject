package jhaywoo2.depaul.studentlife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TeacherController {

    @GetMapping("/displayTeachers")
   public ModelAndView displayTeachers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("teachers");

        return modelAndView;
    }
}
