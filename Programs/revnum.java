import java.io.*;
public class revnum
{
   public static void main(String args[])throws IOException
   {
    int n, reverse = 0;
	BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number to reverse");
    n=Integer.parseInt(input.readLine());
 
    while( n != 0 )
    {
        reverse = reverse * 10;
        reverse = reverse + n%10;
        n = n/10;
    }
 
    System.out.println("Reverse of entered number is "+reverse);
   }
}