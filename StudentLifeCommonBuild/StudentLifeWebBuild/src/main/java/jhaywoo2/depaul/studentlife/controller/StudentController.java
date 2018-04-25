package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.model.Student;
import jhaywoo2.depaul.studentlife.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class StudentController {
    private static final Logger logger = LogManager.getLogger(StudentController.class);

    @Autowired
    StudentService studentService;


    @GetMapping("/signUp")
    public ModelAndView showRegistrationForm(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }

    @PostMapping("/register")
    public ModelAndView welcomeNewUser(@Valid @ModelAttribute("student")Student student, BindingResult bindingResult){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");

        if(bindingResult.hasErrors()){
            mv.setViewName("register");
            return mv;
        }
        studentService.saveStudentToDBs(student);
        mv.setViewName("students");
        return mv;
    }


    @GetMapping("/showStudents")
    public ModelAndView showAllStudents() {
        ModelAndView view = new ModelAndView();
        view.setViewName("students");
        Iterable<Student> students = studentService.getAllStudents();
        Student student = studentService.getOneStudentById();
        logger.info("Student " + student);
        view.addObject("students", students);
        view.addObject("student", student);
        return view;
    }


}
