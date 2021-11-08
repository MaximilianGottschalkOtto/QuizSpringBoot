package com.osp.quizspringboot.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuizService {

    ArrayList<Question> arrayList = new ArrayList<>();
    int i = 0;


    public String beginQuiz() {
        return "Quiz hat gestartet";
    }

    public String question() {
        arrayList.add(new Question("Wie viele Einkerbungen hat ein Golfball?", "a) 336 \n b) 423 \n c) 672", "a"));
        arrayList.add(new Question("Wie viele Weihnachtsbäume werden in Deutschland pro Jahr verkauft?", "a) 30 MIO \n b) 25 MIO \n c) 13 MIO", "a"));
        arrayList.add(new Question("Wie viele Buchstaben hat das hawaiianische Alphabet?", "a) 10 \n b) 14 \n c) 12", "c"));
        return "Frage: " + arrayList.get(i).getQuestion() + " Antwortmöglichkeiten: " + arrayList.get(i).getAnswer();
    }

    public String answer(String param){
        if (param.equals(arrayList.get(i).getSolution())){
            i++;
            return "Richtig!";
        }else {
            i++;
            return "Leider falsch!";
        }
    }

}
