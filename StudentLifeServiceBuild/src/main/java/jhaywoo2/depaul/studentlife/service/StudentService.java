package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Student;
import jhaywoo2.depaul.studentlife.model.StudentMessage;

import java.util.List;

public interface StudentService {
   Iterable<Student> getAllStudents();
   Student getOneStudentById(Long studentId);
   void saveStudentToDBs(Student student);
   boolean doesStudentExist(String userName);
   void saveMessage(StudentMessage message);
   List<StudentMessage> displayAllMessages(String messageRecipient);
}
