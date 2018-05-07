package jhaywoo2.depaul.studentlife.serviceimpl;

import jhaywoo2.depaul.studentlife.model.Student;
import jhaywoo2.depaul.studentlife.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import jhaywoo2.depaul.studentlife.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("studentService")
public class StudentLifeServiceImpl implements StudentService {

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
    public Student getOneStudentById(Long studentId) {
        Student someStudent = studentRepository.findOne(studentId);
        logger.debug("Student from ServiceImpl" + someStudent);
        return someStudent;
    }

    @Transactional
    @Override
    public void saveStudentToDBs(Student student) {
        logger.debug("Saving student");
        studentRepository.save(student);
    }

    @Override
    public boolean doesStudentExist(String userName) {
        return studentRepository.getNumberOfStudentsThatExist(userName) > 0;
    }


}
