import java.io.*;
public class palindrome
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n,sum=0,rem,temp;
		System.out.println("Enter a number : ");
		n=Integer.parseInt(br.readLine());
		temp=n;
		while(n>0)  
		{  
			rem=n%10;
			sum=(sum*10)+rem;		
			n=n/10;  
		}  
		if(temp==sum)  
			System.out.println("Palindrome Number ");   
		else  
			System.out.println("Not a Palindrome Number");   
   
	
	}
}