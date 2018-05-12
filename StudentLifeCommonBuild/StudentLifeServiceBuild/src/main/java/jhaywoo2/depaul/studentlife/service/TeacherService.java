package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher findTeacherById(Long id);
List<Teacher> showAllTeachers();
}
