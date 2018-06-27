package com.depaul.studentlife.serviceimpl;

import com.depaul.studentlife.model.Comment;
import com.depaul.studentlife.model.Professor;
import com.depaul.studentlife.repository.MongoCommentRepository;
import com.depaul.studentlife.repository.ProfessorRepository;
import com.depaul.studentlife.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("professorService")
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Autowired
    MongoCommentRepository mongoCommentRepository;

    @Override
    @Transactional(readOnly = true)
    public Professor findProfessorById(Long id) {
        return professorRepository.getOne(id);
    }

    @Override
    public List<Professor> showAllProfessors() {
        return professorRepository.findAll();
    }

    @Override
    public void saveTeacherComment(Comment comment) {
        mongoCommentRepository.save(comment);

    }

    @Override
    public List<Comment> findAllCommensForProfessor(String professorId) {
        return mongoCommentRepository.findAllByProfessorId(professorId);
    }


}
