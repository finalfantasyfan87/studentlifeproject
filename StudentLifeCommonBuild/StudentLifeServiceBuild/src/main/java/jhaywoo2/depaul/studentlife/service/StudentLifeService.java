package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Student;

import java.util.List;

public interface StudentLifeService {
   public List<Student> getAllStudents();
   Student getOneStudentById();
}
