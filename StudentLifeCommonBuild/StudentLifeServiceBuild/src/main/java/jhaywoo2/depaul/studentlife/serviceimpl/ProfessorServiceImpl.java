package jhaywoo2.depaul.studentlife.serviceimpl;

import jhaywoo2.depaul.studentlife.model.Professor;
import jhaywoo2.depaul.studentlife.repository.ProfessorRepository;
import jhaywoo2.depaul.studentlife.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("professorService")
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Override
    public Professor findProfessorById(Long id) {
        return professorRepository.findOne(id);
    }

    @Override
    public List<Professor> showAllProfessors() {
        return professorRepository.findAll();
    }
}
