package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.model.Student;
import jhaywoo2.depaul.studentlife.service.StudentLifeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    private static final Logger logger = LogManager.getLogger(StudentController.class);

    @Autowired
    StudentLifeService studentLifeService;

    @GetMapping("/getStudents")
   public  ModelAndView showAllStudents(){
        ModelAndView view = new ModelAndView();
        view.setViewName("students");
        ArrayList students = studentLifeService.getAllStudents();
   Student student=     studentLifeService.getOneStudentById();
        logger.info("Students  "+ students);
        view.addObject("student", student);
return view;
    }
}
