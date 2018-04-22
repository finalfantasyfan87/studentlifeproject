package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
