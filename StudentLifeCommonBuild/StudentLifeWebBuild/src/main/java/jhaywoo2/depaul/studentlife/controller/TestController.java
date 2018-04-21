package jhaywoo2.depaul.studentlife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @GetMapping(value = "/test")
    ModelAndView sayHello(){
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        return view;
    }
}
