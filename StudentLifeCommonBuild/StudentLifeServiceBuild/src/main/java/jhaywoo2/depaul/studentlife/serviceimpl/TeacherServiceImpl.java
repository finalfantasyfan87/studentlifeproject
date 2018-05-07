package jhaywoo2.depaul.studentlife.serviceimpl;

import jhaywoo2.depaul.studentlife.model.Teacher;
import jhaywoo2.depaul.studentlife.repository.TeacherRepository;
import jhaywoo2.depaul.studentlife.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public Teacher findTeacherById(Long id) {
        return teacherRepository.findOne(id);
    }

    @Override
    public List<Teacher> showAllTeachers() {
        return teacherRepository.findAll();
    }
}
