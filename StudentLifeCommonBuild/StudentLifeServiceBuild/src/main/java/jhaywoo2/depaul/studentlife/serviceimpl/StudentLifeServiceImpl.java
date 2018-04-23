package jhaywoo2.depaul.studentlife.serviceimpl;

import jhaywoo2.depaul.studentlife.model.Student;
import jhaywoo2.depaul.studentlife.service.StudentLifeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import jhaywoo2.depaul.studentlife.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service("studentServiceLife")
public class StudentLifeServiceImpl implements StudentLifeService {

    private static final Logger logger = LogManager.getLogger(StudentLifeServiceImpl.class);

    @Autowired
    protected StudentRepository studentRepository;

    @Override
    public Iterable<Student> getAllStudents() {
        Iterable<Student> students = studentRepository.findAll();
        logger.debug("Students from ServiceImpl" + students);
        return students;
    }

    @Override
    public Student getOneStudentById() {
        Student someStudent = studentRepository.findOne(1L);
        logger.debug("Student from ServiceImpl" + someStudent);
        return someStudent;
    }
}
