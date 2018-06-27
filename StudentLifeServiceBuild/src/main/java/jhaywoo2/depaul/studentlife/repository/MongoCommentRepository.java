package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoCommentRepository extends MongoRepository<Comment,String> {

    List<Comment> findAllByProfessorId(String professorId);
}
