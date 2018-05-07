package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "Select count (s) as totalStudents from Student s where s.userName = ?1")
    public int getNumberOfStudentsThatExist(String username);
}
