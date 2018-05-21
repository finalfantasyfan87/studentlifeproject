package jhaywoo2.depaul.studentlife.service;

import jhaywoo2.depaul.studentlife.model.Professor;

import java.util.List;

public interface ProfessorService {
    Professor findProfessorById(Long id);
List<Professor> showAllProfessors();
}
