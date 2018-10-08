public abstract class Card
{
    private String subject;
    private String question;
    private String answer;

    public Card(){}

      public Card(String subject, String question , String answer)
    {
        this.subject = subject;
        this.question = question;
        this.answer = answer;
    }


    /*
    ----------------------------------------------------------------------
    GETTERS AND SETTERS
    ----------------------------------------------------------------------
    */
    public String getSubject()
    {
        return this.subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    public String getQuestion()
    {
        return this.question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }
    public String getAnswer()
    {
        return this.answer;
    }

    public void setAnswer(String answer)
    {
        this.answer = answer;
    }
}
