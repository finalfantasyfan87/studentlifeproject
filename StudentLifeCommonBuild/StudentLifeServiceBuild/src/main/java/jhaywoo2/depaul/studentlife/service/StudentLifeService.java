package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Student;

public interface StudentLifeService {
   public Iterable<Student> getAllStudents();
   Student getOneStudentById();
}
