package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.StudentMessage;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MongoMessagesRepository extends MongoRepository<StudentMessage, String>{
}