
/*
EOF ma
rker is -1
If the file is present on the disk it will be moved to the random access memory of the program and if not there,
the program will run the catch block i.e it will throw an exception
'in' is a pointer pointing to the first character of the file
The internal system inserts a '-1' at the end of the file which acts as a marker
*/
import java.io.*;
public class FilesUsingFileReader
{
    public static void main(String args[])
    {
      FileReader in = null;
      long start = 0;
      long end = 0;
      try
      {
          in = new FileReader("test.txt");
          int ch; //Returns the ASCII value of the character being read
          start = System.currentTimeMillis();
          while ((ch = in.read()) != -1)
          {
              System.out.print((char) ch);
              ch = in.read();
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
          }
          catch(IOException ioe)
          {
              System.out.println("Issues with certain peripheral devices");
          }
      }
      System.out.println(end - start);
    }
}
