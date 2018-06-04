package jhaywoo2.depaul.studentlife.controller;

        import jhaywoo2.depaul.studentlife.model.StudentMessage;
        import jhaywoo2.depaul.studentlife.service.StudentService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.validation.BindingResult;
        import org.springframework.web.bind.annotation.ModelAttribute;
        import org.springframework.web.bind.annotation.PostMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController{

        @Autowired
        StudentService studentService;

        @PostMapping("/sendMessage")
        public StudentMessage sendMessage(@ModelAttribute("message") StudentMessage message,
                                          @RequestParam("messageRecipient")String messageRecipient,
                                          @RequestParam("messageBody") String messageBody,
                                          BindingResult bindingResult){
                StudentMessage studentMessage = new StudentMessage();
                studentService.saveMessage(new StudentMessage(messageRecipient, messageBody));
                return studentMessage;
        }


}

