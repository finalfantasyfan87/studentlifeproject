package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Teacher;

import java.util.List;

public interface TeacherService {

public  Teacher findTeacherById(Long id);
public List<Teacher> showAllTeachers();
}
