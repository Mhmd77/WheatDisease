package ir.hoshmand.zamin.iran.wheatdisease.models;

import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<Answer> answers;

    public String getQuestion() {
        return question;
    }

    public Question(String question) {
        this.question = question;
        answers = new ArrayList<>();
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<Answer> getAnswers() {
        return answers;
    }

    public void addAnswers(String answer) {
        answers.add(new Answer(answer));
    }

    public void addAnswers(String title, String answer) {
        answers.add(new Answer(title, answer));
    }
}