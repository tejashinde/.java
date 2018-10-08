import java.io.*;
public class leapyear
{
 
        public static void main(String []args)throws IOException 
		{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				int year;
				System.out.println("Enter a year");
				year=Integer.parseInt(br.readLine());
				if((year%400==0)||((year%4==0)&&(year%100!=0)))
                        System.out.println("Year " + year + " is a leap year");
				else
                        System.out.println("Year " + year + " is not a leap year");
        }
}