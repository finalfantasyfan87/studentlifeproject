package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}