package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.model.Teacher;
import jhaywoo2.depaul.studentlife.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    protected TeacherService teacherService;

    @GetMapping("/displayTeachers")
   public ModelAndView displayTeachers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("teachers");
        List<Teacher> teachers= teacherService.showAllTeachers();
        modelAndView.addObject("teachers", teachers);
        return modelAndView;
    }


}
