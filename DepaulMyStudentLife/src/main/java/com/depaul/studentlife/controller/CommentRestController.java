package com.depaul.studentlife.controller;

import com.depaul.studentlife.model.Comment;
import com.depaul.studentlife.service.ProfessorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentRestController {

    private static final Logger logger = LogManager.getLogger(CommentRestController.class);
    @Autowired
    ProfessorService professorService;
    @PostMapping("/saveComment")
    public void saveComment(@ModelAttribute("professorComment")Comment professorComment,
                            @RequestParam("professorId") String professorId,
                            @RequestParam("comment")String comment){
logger.debug(professorId + " Comment " +comment);
        professorService.saveTeacherComment(new Comment(professorId, comment));

    }
}
