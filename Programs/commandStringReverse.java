import java.io.*;

class commandStringReverse{
    
    public static void main(String args[])
    {
        int i = 0;
        while(args[i]!=null)
        {
        StringBuffer sb = new StringBuffer(args[i]);
        System.out.println(sb.reverse());
        i++;
        }
    }
}