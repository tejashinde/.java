import SY.SYMarks;
import TY.TYMarks;
class Student
{
    public static void main(String[] args)
    {
        SYMarks symarks = new SYMarks();
        TYMarks tymarks = new TYMarks();
        float sum = symarks.CompTotalMarks(100,60,30) + tymarks.AddTandP(70,70);
        if((sum/3) >= 70)
        {
            System.out.println("A grade : " + sum/3);
        }
        if((sum/3) >= 60 && (sum/3) <= 69)
        {
            System.out.println("B grade : " + sum/3);
        }
        if((sum/3) >= 50 && (sum/3) <= 59)
        {
            System.out.println("C grade : " + sum/3);
        }
        if((sum/3) >= 40 && (sum/3) <= 49)
        {
            System.out.println("Pass : " + sum/3);
        }
    }
}
//After Compiling the package file,
//javac -d . Student.java
//java Student.java