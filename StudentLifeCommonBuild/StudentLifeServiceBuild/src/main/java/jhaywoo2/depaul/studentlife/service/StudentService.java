package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Student;

public interface StudentService {
   Iterable<Student> getAllStudents();
   Student getOneStudentById();
   void saveStudentToDBs(Student student);
}
