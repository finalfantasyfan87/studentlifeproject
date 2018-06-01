package jhaywoo2.depaul.studentlife.repository;

import jhaywoo2.depaul.studentlife.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MongoMessagesRepository extends MongoRepository<Message, String>{
}
