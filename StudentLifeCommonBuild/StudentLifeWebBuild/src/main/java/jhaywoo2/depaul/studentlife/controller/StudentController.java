package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.service.StudentLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
@Autowired
    StudentLifeService studentLifeService;

    @GetMapping("/getStudents")
    ModelAndView showAllStudents(){
        ModelAndView view = new ModelAndView();
        view.setViewName("students");
        List students = studentLifeService.getAllStudents();
        view.addObject("students", students);
return view;
    }
}
