package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoCommentRepository extends MongoRepository<Comment,String> {
}
