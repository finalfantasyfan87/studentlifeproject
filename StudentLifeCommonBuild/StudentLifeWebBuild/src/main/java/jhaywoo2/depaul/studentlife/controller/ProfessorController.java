package jhaywoo2.depaul.studentlife.controller;

import jhaywoo2.depaul.studentlife.model.Professor;
import jhaywoo2.depaul.studentlife.service.ProfessorService;
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
        professors.forEach(professor -> {
            logger.info("Department:" + professor.getProfessorId());
            logger.info("Department:" + professor.getDepartment());
        });
        modelAndView.addObject("professors", professors);
        return modelAndView;
    }

    @GetMapping("/rateTeacher")
    public ModelAndView showRateTeacherPage(@RequestParam("professorId") Long professorId){
        Professor profiledProfessor = professorService.findProfessorById(professorId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("rateTeacher");
        modelAndView.addObject("profiledProfessor",profiledProfessor);
        return modelAndView;
    }


}
