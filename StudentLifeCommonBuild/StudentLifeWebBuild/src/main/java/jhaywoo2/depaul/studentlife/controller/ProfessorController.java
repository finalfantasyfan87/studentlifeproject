package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.model.Professor;
import jhaywoo2.depaul.studentlife.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProfessorController {
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
    public ModelAndView showRateTeacherPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("rateTeacher");
        return modelAndView;
    }


}
