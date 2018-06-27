package com.depaul.studentlife.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.depaul.studentlife.model.StudentMessage;


public interface MongoMessagesRepository extends MongoRepository<StudentMessage, String>{
    List<StudentMessage> findAllByMessageRecipient(String messageRecipient);
}
