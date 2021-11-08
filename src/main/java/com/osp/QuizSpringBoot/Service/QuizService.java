package com.osp.QuizSpringBoot.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class QuizService {
    Question question = new Question("Wie viele Einkerbungen hat ein Golfball?", "a) 336 \n b) 423 \n c) 672", "a");
    Question question1 = new Question("Wie viele Weihnachtsbäume werden in Deutschland pro Jahr verkauft?", "a) 30 MIO \n b) 25 MIO \n c) 13 MIO", "a");;
    Question question2 = new Question("Wie viele Buchstaben hat das hawaiianische Alphabet?", "a) 10 \n b) 14 \n c) 12", "c");
    int i = 0;


    public String beginQuiz() {
        return "Quiz hat gestartet";
    }

    public Question questions() {
        if (i == 0){
            return question;
        }else if(i == 1){
            return question1;
        }else {
            return question2;
        }
    }

    public String answer(String param){
        if (i == 0 && param.equals(question.getSolution())){
            i++;
            return "Richtig";
        }else if(i == 0){
            i++;
            return "Falsch";
        }
        if (i == 1 && param.equals(question1.getSolution())){
            i++;
            return "Richtig";
        }else if(i == 1){
            i++;
            return "Falsch";
        }
        if (i == 2 && param.equals(question2.getSolution())){
            return "Richtig & vorbei";
        }else {
            return "Falsch & vorbei";
        }
    }

}
