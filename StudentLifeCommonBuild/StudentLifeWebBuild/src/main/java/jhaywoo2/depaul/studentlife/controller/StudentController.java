package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.model.Student;
import jhaywoo2.depaul.studentlife.service.StudentLifeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.enterprise.inject.Model;

@Controller
public class StudentController {
    private static final Logger logger = LogManager.getLogger(StudentController.class);

    @Autowired
    StudentLifeService studentLifeService;

    @GetMapping("/showStudents")
    public ModelAndView showAllStudents() {
        ModelAndView view = new ModelAndView();
        view.setViewName("students");
        Iterable<Student> students = studentLifeService.getAllStudents();
        Student student = studentLifeService.getOneStudentById();
        logger.info("Student " + student);
        view.addObject("student", student.toString());
        return view;
    }

    @GetMapping("/displayRegistrationForm")
    public ModelAndView showRegistrationForm(@ModelAttribute("student")Student student,
                                             BindingResult bindingResult){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }
}
