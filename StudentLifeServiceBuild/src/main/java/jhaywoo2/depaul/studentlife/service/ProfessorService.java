package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Comment;
import jhaywoo2.depaul.studentlife.model.Professor;

import java.util.List;

public interface ProfessorService {
    Professor findProfessorById(Long id);
List<Professor> showAllProfessors();
void saveTeacherComment(Comment professorFeedBack);
List<Comment> findAllCommensForProfessor(String professorId);

}
