import java.io.*;
public class maxmintwo
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br1= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2= new BufferedReader(new InputStreamReader(System.in));
		int n1,n2;
		System.out.println("Enter 1st number : ");
		n1=Integer.parseInt(br1.readLine());
		System.out.println("Enter 2nd number : ");
		n2=Integer.parseInt(br2.readLine());
		if(n1>n2)
		{
			System.out.println("1st number is greater than 2nd");
		}
		else if(n1<n2)
		{
			System.out.println("2nd number is greater than 1st");
		}
		else
		{
			System.out.println("Both numbers are equal");
		}
	}
}