package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Teacher;

public interface TeacherService {

  Teacher findTeacherById(Long id);
  List<Teacher> showAllTeachers();
}
