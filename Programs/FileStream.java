import java.io.*;
class FileStream
{
public static void main(String args[]) throws FileNotFoundException
	{
		try
		{
		FileOutputStream fos=new FileOutputStream("a.txt");
		int n;
			System.out.println("Enter Character - ctrl z to end");
		while((n=System.in.read())!=-1)
			fos.write(n);
		System.out.println("File created successfully");
		fos.close();		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

