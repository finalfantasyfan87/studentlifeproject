package com.depaul.studentlife.serviceimpl;

import com.depaul.studentlife.model.StudentMessage;
import com.depaul.studentlife.model.Student;
import com.depaul.studentlife.repository.MongoMessagesRepository;
import com.depaul.studentlife.repository.StudentRepository;
import com.depaul.studentlife.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentLifeServiceImpl implements StudentService {

    private static final Logger logger = LogManager.getLogger(StudentLifeServiceImpl.class);

    @Autowired
    protected StudentRepository studentRepository;

    @Autowired
    protected MongoMessagesRepository mongoMessagesRepository;

    @Override
    public Iterable<Student> getAllStudents() {
        Iterable<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student getOneStudentById(Long studentId) {
        Student someStudent = studentRepository.getOne(studentId);
        logger.debug("Student from ServiceImpl" + someStudent);
        return someStudent;
    }


    @Override

    public void saveStudentToDBs(Student student) {
        logger.debug("Saving student");
        studentRepository.saveAndFlush(student);
     }
    

    @Override
    public boolean doesStudentExist(String userName) {
        return studentRepository.getNumberOfStudentsThatExist(userName) > 0;
    }

    @Override
    public void saveMessage(StudentMessage message) {
        mongoMessagesRepository.save(message);
    }

    @Override
    public List<StudentMessage> displayAllMessages(String messageRecipient) {
        return mongoMessagesRepository.findAllByMessageRecipient(messageRecipient);
    }

	@Override
	public String getPasswordFromDb(String userName) {
		// TODO Auto-generated method stub
		return studentRepository.findPasswordByUserName(userName);
	}

	



}
