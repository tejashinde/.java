package TY;

public class TYMarks
{
    public float AddTandP(float Theory,
                        float Practical)
    {
        if(Theory>100 || Practical>100)
        {
            System.out.println("Please enter valid marks");
        }
        return(Theory + Practical);
    }
}
//javac -d . TYMarks.java