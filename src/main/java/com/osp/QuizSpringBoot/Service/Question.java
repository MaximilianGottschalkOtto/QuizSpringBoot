package com.osp.QuizSpringBoot.Service;

public class Question {

    private String question;
    private String answer;
    private String solution;

    public Question(String question, String answer, String solution) {
        this.question = question;
        this.answer = answer;
        this.solution = solution;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }
}
