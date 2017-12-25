package ir.hoshmand.zamin.iran.wheatdisease.models;


public class Answer {

    private String title, ans;
    private Question nextQuestion;

    public Question getNextQuestion() {
        return nextQuestion;
    }

    public Answer(String title, Question nextQuestion) {
        this.title = title;
        this.nextQuestion=nextQuestion;


    }

    public Answer(String title, String ans) {
        this.title = title;
        this.ans = ans;
        nextQuestion=null;
    }

    public String getTitle() {
        return title;
    }

    public boolean isFinished() {
        if (nextQuestion==null){
            return true;
        }
        return false;
    }

    public String getAns() {
        return ans;
    }


}
