import java.io.*;
public class almstrong
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n,c=0,rem,temp;
		System.out.println("Enter a number : ");
		n=Integer.parseInt(br.readLine());
		temp=n;
		while(n>0)  
		{  
			rem=n%10;  
			n=n/10;  
			c=c+(rem*rem*rem);  
		}  
		if(temp==c)  
			System.out.println("armstrong number");   
		else  
			System.out.println("Not armstrong number");   
   
	
	}
}

