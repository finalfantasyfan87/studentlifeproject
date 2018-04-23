package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Student;

public interface StudentLifeService {
   Iterable<Student> getAllStudents();
   Student getOneStudentById();
   void studentToDB(Student student);
}
