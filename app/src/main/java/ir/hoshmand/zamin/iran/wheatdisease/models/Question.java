package ir.hoshmand.zamin.iran.wheatdisease.models;

import java.util.ArrayList;

public class Question {
    private Question prev;
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

    public void addAnswers(Answer answer) {
        answers.add(answer);
    }

    public Question getPrev() {
        return prev;
    }

    public void setPrev(Question prev) {
        this.prev = prev;
    }
}