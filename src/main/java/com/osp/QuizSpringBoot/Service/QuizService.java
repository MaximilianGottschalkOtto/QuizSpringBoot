package com.osp.QuizSpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuizService {
    List<String> list = new ArrayList<>();
    List<String> answer = new ArrayList<>();
    List<String> solution = new ArrayList<>();
    int count = 0;
    int score = 0;



    List<String> arrayList = new ArrayList<>();

    public String beginQuiz() {
        return "Quiz hat gestartet";
    }

    public String questions() {
        list.add("Wie viele Weihnachtsbäume werden in Deutschland pro Jahr verkauft?");
        answer.add("a) 30 MIO \n b) 25 MIO \n c) 13 MIO");
        solution.add("a");

        list.add("Wie viele Buchstaben hat das hawaiianische Alphabet?");
        answer.add("a) 10 \n b) 14 \n c) 12");
        solution.add("c");

        list.add("Wie viele Einkerbungen hat ein Golfball?");
        answer.add("a) 336 \n b) 423 \n c) 672");
        solution.add("a");

        return "Frage: " + list.get(count) + " \n Antwortmöglichkeiten: " + answer.get(count);
    }

    public String answer(String param){
        if (param.equals(solution.get(count))){
            count++;
            score = score + 5;
            return "Du hast die Frage richtig beantwortet! Dein Score: " + score + ".";
        }else{
            count++;
            return "Leider falsch, versuche es doch mit der nächsten Frage. Dein Score: " + score + ".";
        }
    }

}
