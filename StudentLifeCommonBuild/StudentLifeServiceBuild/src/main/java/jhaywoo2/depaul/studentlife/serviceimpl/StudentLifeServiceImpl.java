package jhaywoo2.depaul.studentlife.serviceimpl;

import jhaywoo2.depaul.studentlife.service.StudentLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import jhaywoo2.depaul.studentlife.repository.StudentRepository;

import java.util.List;

public class StudentLifeServiceImpl implements StudentLifeService {
    @Autowired
    protected StudentRepository studentRepository;

    @Override
    public List getAllStudents() {
        return studentRepository.findAll();
    }
}
