package SY;

public class SYMarks
{
    public float CompTotalMarks(float CompTotal,
                              float MathTotal,
                              float ElectTotal)
    {
        if(CompTotal>100)
        {
            System.out.println("Please enter valid marks");
            return 0;
        }
        
        return(CompTotal);
    }
}
//javac -d . SYMarks.java