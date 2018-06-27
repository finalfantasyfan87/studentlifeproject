package com.depaul.studentlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.depaul.studentlife.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "Select count (s) as totalStudents from Student s where s.userName = ?1")
    public int getNumberOfStudentsThatExist(String username);
    
    @Query(value = "Select s.password from Student s where s.userName = ?1")
    public String findPasswordByUserName(String username);
}