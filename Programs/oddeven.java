import java.io.*;
public class oddeven
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n;
		System.out.println("Enter a number : ");
		n=Integer.parseInt(br.readLine());
		if(n%2==0)
		System.out.println("Number is even");
		else
		System.out.println("Number is odd");	
	}
}