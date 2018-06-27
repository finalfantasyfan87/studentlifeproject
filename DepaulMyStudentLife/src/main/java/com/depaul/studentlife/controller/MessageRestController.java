package com.depaul.studentlife.controller;

import com.depaul.studentlife.model.StudentMessage;
import com.depaul.studentlife.service.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
    private static final Logger logger = LogManager.getLogger(MessageRestController.class);

    @Autowired
    StudentService studentService;

    @PostMapping("/sendMessage")
    public void sendMessage(@ModelAttribute("message") StudentMessage message,
                            @RequestParam("messageRecipient") String messageRecipient,
                            @RequestParam("messageBody") String messageBody) {
        logger.debug("Recipient: " + messageRecipient);
        logger.debug("message: " + messageBody);
        studentService.saveMessage(new StudentMessage(messageRecipient, messageBody));
    }


}

