package com.osp.QuizSpringBoot.Controller;


import com.osp.QuizSpringBoot.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping( "quiz" )
@RestController
public class Controller {


    @Autowired
    private QuizService service;

    @GetMapping("/begin")
    public String begin(){
        return service.beginQuiz();
    }

    @GetMapping("/question")
    public String question(){
        return service.questions();
    }

    @GetMapping("/question/{answer}")
    public String answer(@PathVariable ("answer") String param){
        return service.answer(param);
    }
}
