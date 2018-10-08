public class Flashcard {
    private String question;
    private String answer;

    public Flashcard(){}

    public Flashcard(String newquestion, String newanswer) {
        setquestion(newquestion);
        setanswer(newanswer);
    }

    public String getquestion(){
        return question;
    }

    public String getanswer(){
        return answer;
    }

    public void setquestion(String newquestion){
        question = newquestion;
    }

    public void setanswer(String newanswer) {
        answer = newanswer;
    }

    public String toString() {
        return question + " : " + answer;
    }
}
