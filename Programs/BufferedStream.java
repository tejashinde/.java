import java.io.*;
public class BufferedStream
{
public static void main(String args[])throws IOException
	{
	try
		{
		BufferedInputStream bis=new BufferedInputStream(System.in);
		int n;
		bis.mark(0);
		System.out.println("Enter character - ctrl z to end");
		while((n=bis.read())!=-1)
		bis.reset();
		while(bis.available()>0)
			{
			n=bis.read();
			System.out.print((char)n);
			bis.skip(1);
			}
		bis.close();	
		}
	catch(Exception e)
		{
		System.out.println(e);
		}	
	}
}
