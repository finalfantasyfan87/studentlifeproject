package com.depaul.studentlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.depaul.studentlife.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}