package com.depaul.studentlife.controller;

import com.depaul.studentlife.model.Comment;
import com.depaul.studentlife.model.Professor;
import com.depaul.studentlife.service.ProfessorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProfessorController {
    private static final Logger logger = LogManager.getLogger(ProfessorController.class);

    @Autowired
    protected ProfessorService professorService;

    @GetMapping("/displayTeachers")
   public ModelAndView displayTeachers(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("professors");
        List<Professor> professors= professorService.showAllProfessors();
        modelAndView.addObject("professors", professors);
        return modelAndView;
    }

    @GetMapping("/rateTeacher")
    public ModelAndView showRateTeacherPage(@RequestParam("professorId") Long professorId){
        Professor profiledProfessor = professorService.findProfessorById(professorId);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("rateTeacher");
        Comment professorComment = new Comment();
        List<Comment> professorComments = professorService.findAllCommensForProfessor(professorId.toString());
        logger.debug("Courses are: "+ profiledProfessor.getCourseList().size());
        modelAndView.addObject("profiledProfessor",profiledProfessor);
        modelAndView.addObject("professorComment",professorComment);
        modelAndView.addObject("professorComments",professorComments);
        return modelAndView;
    }


}
