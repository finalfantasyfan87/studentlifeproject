package com.depaul.studentlife.service;

import java.util.List;

import com.depaul.studentlife.model.Comment;
import com.depaul.studentlife.model.Professor;

public interface ProfessorService {
	Professor findProfessorById(Long id);

	List<Professor> showAllProfessors();

	void saveTeacherComment(Comment professorFeedBack);

	List<Comment> findAllCommensForProfessor(String professorId);

}
