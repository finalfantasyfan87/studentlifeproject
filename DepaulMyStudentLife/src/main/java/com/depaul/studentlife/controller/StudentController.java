package com.depaul.studentlife.controller;

import com.depaul.studentlife.model.Student;
import com.depaul.studentlife.model.StudentMessage;
import com.depaul.studentlife.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

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
	public String welcomeNewUser(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register");

		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("register");
			logger.error(genericError);
			modelAndView.addObject("genericError", genericError);
			return "redirect:register";
		}
		studentService.saveStudentToDBs(student);
		modelAndView.setViewName("students");
		return "redirect:displayStudents";
	}

	@GetMapping("/login")
	public ModelAndView showLoginForm() throws Exception{
		ModelAndView modelAndView = new ModelAndView("login", "student", new Student());
		logger.debug("ViewName is " + modelAndView.getViewName());

		modelAndView.addObject("viewName", modelAndView.getViewName());
		return modelAndView;
	}

	@PostMapping("/loginStudent")
	public ModelAndView loginStudent(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult,HttpSession session,
			RedirectAttributes attributes) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		String userName = student.getUserName();
		if (bindingResult.hasFieldErrors("userName") || bindingResult.hasFieldErrors("password")) {

			modelAndView.setViewName("login");
			logger.error(bindingResult.getAllErrors());
			modelAndView.addObject("genericError", genericError);
			return modelAndView;
		}

		boolean doesStudentExist = studentService.doesStudentExist(userName);
		boolean isPasswordCorrect = student.getPassword().equals(studentService.getPasswordFromDb(userName));
		modelAndView.addObject("doesStudentExist", doesStudentExist);
		modelAndView.addObject("isPasswordCorrect", isPasswordCorrect);
		if (doesStudentExist && isPasswordCorrect ) {
			
			session.setAttribute("userName", userName);
			modelAndView.addObject("userName", userName);
			attributes.addFlashAttribute("userName", userName);
//			modelAndView.addObject("userExistMessage", doesStudentExist);
			modelAndView.setViewName("redirect:displayStudents");
//			modelAndView.setViewName("students");
		} else {
			String incorrectLoginMessage = "Please check your credentials.";
			String userExistMessage = "Please verify you have an account with us.";
			modelAndView.setViewName("login");
			modelAndView.addObject("userExistMessage", userExistMessage);
			modelAndView.addObject("incorrectLoginMessage", incorrectLoginMessage);
		
		}
		return modelAndView;
	}

	@GetMapping("/displayStudents")
	public ModelAndView showAllStudents(HttpSession httpSession ) {
		String userName = (String) httpSession.getAttribute("userName");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("students");
		StudentMessage studentMessage = new StudentMessage();
		Iterable<Student> students = studentService.getAllStudents();
		modelAndView.addObject("message", studentMessage);
		modelAndView.addObject("students", students);

		List<StudentMessage> studentMessages = studentService.displayAllMessages(userName);
		logger.debug("Messages for: " + studentMessages);
		modelAndView.addObject("studentMessages", studentMessages);
		modelAndView.addObject("students", students);
		return modelAndView;
	}

}
