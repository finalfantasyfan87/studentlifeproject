package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Student;

import java.util.ArrayList;

public interface StudentLifeService {
   public ArrayList getAllStudents();
   Student getOneStudentById();
}
