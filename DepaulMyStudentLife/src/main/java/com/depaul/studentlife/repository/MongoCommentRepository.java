package com.depaul.studentlife.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.depaul.studentlife.model.Comment;

import java.util.List;

public interface MongoCommentRepository extends MongoRepository<Comment,String> {

    List<Comment> findAllByProfessorId(String professorId);
}
