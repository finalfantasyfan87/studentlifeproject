package com.depaul.studentlife.service;

import com.depaul.studentlife.model.Student;
import com.depaul.studentlife.model.StudentMessage;

import java.util.List;

public interface StudentService {
 public  Iterable<Student> getAllStudents();
 public Student getOneStudentById(Long studentId);
 public void saveStudentToDBs(Student student);
 public boolean doesStudentExist(String userName);
 public String getPasswordFromDb(String userName);
 public  void saveMessage(StudentMessage message);
 public List<StudentMessage> displayAllMessages(String messageRecipient);
}
