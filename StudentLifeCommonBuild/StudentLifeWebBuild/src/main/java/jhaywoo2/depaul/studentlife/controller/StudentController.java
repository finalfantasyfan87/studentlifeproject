package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.model.Student;
import jhaywoo2.depaul.studentlife.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class StudentController {
    private static final Logger logger = LogManager.getLogger(StudentController.class);

    @Autowired
    StudentService studentService;


    @GetMapping("/signUp")
    public ModelAndView showRegistrationForm(){
        return new ModelAndView("register","student", new Student());
    }

    @PostMapping("/registerUser")
    public ModelAndView welcomeNewUser( @ModelAttribute("student")Student student, BindingResult bindingResult){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");

        if(bindingResult.hasErrors()){
            mv.setViewName("register");
            logger.error("An error has occurred.");
            return mv;
        }
        studentService.saveStudentToDBs(student);
        mv.setViewName("welcome");
        return mv;
    }


    @GetMapping("/login")
    public ModelAndView showLoginForm(){
        return new ModelAndView("login", student, new Student());
    }

    @PostMapping("/loginStudent")
    public ModelAndView loginStudent(@ModelAttribute("student")Student student, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        if(bindingResult.hasErrors()){
            mv.setViewName("login");
            logger.error("An error has occurred.");
            return mv;
        }


        return modelAndView;
    }
    @GetMapping("/showStudents")
    public ModelAndView showAllStudents() {
        ModelAndView view = new ModelAndView();
        view.setViewName("students");
        Iterable<Student> students = studentService.getAllStudents();
        view.addObject("students", students);
        return view;
    }


}
