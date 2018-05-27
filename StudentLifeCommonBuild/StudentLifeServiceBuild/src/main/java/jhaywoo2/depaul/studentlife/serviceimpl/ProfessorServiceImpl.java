package jhaywoo2.depaul.studentlife.serviceimpl;

import jhaywoo2.depaul.studentlife.model.Professor;
import jhaywoo2.depaul.studentlife.repository.ProfessorRepository;
import jhaywoo2.depaul.studentlife.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("professorService")
public class ProfessorServiceImpl implements ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    @Override
    @Transactional(readOnly = true)
    public Professor findProfessorById(Long id) {
        return professorRepository.getOne(id);
    }

    @Override
    public List<Professor> showAllProfessors() {
        return professorRepository.findAll();
    }
}
