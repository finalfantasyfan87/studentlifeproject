package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
