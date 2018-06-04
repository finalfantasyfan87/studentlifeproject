package jhaywoo2.depaul.studentlife.controller;

        import jhaywoo2.depaul.studentlife.model.Student;
        import jhaywoo2.depaul.studentlife.model.StudentMessage;
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
    String genericError = "An error has occurred.";


    @GetMapping("/register")
    public ModelAndView showRegistrationForm() {
        ModelAndView modelAndView = new ModelAndView("register", "student", new Student());
        modelAndView.addObject("viewName", modelAndView.getViewName());
        return modelAndView;
    }

    @PostMapping("/registerUser")
    public ModelAndView welcomeNewUser(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");

        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("register");
            logger.error(genericError);
            modelAndView.addObject("genericError", genericError);
            return modelAndView;
        }
        studentService.saveStudentToDBs(student);
        modelAndView.setViewName("students");
        return modelAndView;
    }


    @GetMapping("/login")
    public ModelAndView showLoginForm() {
        ModelAndView modelAndView = new ModelAndView("login", "student", new Student());
        logger.debug("ViewName is "+ modelAndView.getViewName());

        modelAndView.addObject("viewName", modelAndView.getViewName());
        return modelAndView;
    }

    @PostMapping("/loginStudent")
    public ModelAndView loginStudent(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");


        if (bindingResult.hasFieldErrors("userName") || bindingResult.hasFieldErrors("password")) {

            modelAndView.setViewName("login");
            logger.error(genericError);
            modelAndView.addObject("genericError", genericError);
            return modelAndView;
        }

        boolean doesStudentExist = studentService.doesStudentExist(student.getUserName());
        modelAndView.addObject("doesStudentExist", doesStudentExist);
        if (doesStudentExist) {
            StudentMessage studentMessage = new StudentMessage();
            Iterable<Student> students = studentService.getAllStudents();
            modelAndView.setViewName("students");
            modelAndView.addObject("message",studentMessage);
            modelAndView.addObject("students",students);
        } else {
            String userExistMessage = "Please verify you have an account with us.";
            modelAndView.setViewName("login");
            modelAndView.addObject("userExistMessage", userExistMessage);
        }
        return modelAndView;
    }

    @GetMapping("/displayStudents")
    public ModelAndView showAllStudents() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("students");
        StudentMessage studentMessage = new StudentMessage();
        Iterable<Student> students = studentService.getAllStudents();
        modelAndView.addObject("message",studentMessage);
        modelAndView.addObject("students", students);
        return modelAndView;
    }

}
