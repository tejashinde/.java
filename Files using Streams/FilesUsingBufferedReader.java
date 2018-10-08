import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FilesUsingBufferedReader
{
    public static void main(String args[])
    {
        BufferedReader br = null;
        long start = 0;
        long end = 0;

        try
        {
            br = new BufferedReader(new FileReader("test.txt"));
            String data;
            start = System.currentTimeMillis();
            while((data = br.readLine()) != null)
            {
                System.out.println(data);
            }
            end = System.currentTimeMillis();
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found on the disk");
        }
        catch(IOException ioe)
        {
            System.out.println("Issues with certain peripheral hardware devices");
        }
        finally
        {
          try
          {
              br.close();
          }
          catch(IOException ioe)
          {
            System.out.println("Issues with certain peripheral hardware devices");
          }
        }
        System.out.println(end-start);
    }
}
