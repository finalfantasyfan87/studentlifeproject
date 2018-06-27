package com.depaul.studentlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.depaul.studentlife.model.Student;
import com.depaul.studentlife.repository.StudentRepository;

@RestController
public class StudentRestController {
	@Autowired
	StudentRepository studentRepository;
	
	
	@GetMapping("/students")
	List<Student>showAllStudents(){
		List<Student> students = studentRepository.findAll();
		return students;
		
	}
	

	
	
	
	

}
