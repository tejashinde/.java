import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class FileCopy
{
    public static void main(String args[])
    {
        FileReader fileReaderIn = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        long start = 0;
        long end = 0;

        try
        {
            in = new BufferedReader(new FileReader("test.txt"));
            out = new BufferedWriter(new FileWriter("copyfile.txt"));
            String data;

            start = System.currentTimeMillis();
            while ((data = in.readLine()) != null)
            {
                out.write(data);
                out.newLine();
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
                  in.close();
                  out.close();
              }
              catch(IOException ioe)
              {
                  System.out.println("Issues with certain peripheral hardware devices");
              }
          }
        System.out.println(end - start + "milliseconds");
    }
}
