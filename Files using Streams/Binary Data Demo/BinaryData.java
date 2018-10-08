import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class BinaryData
{
    public static void main(String args[])
    {
        FileInputStream in = null;
        FileOutputStream out = null;

        try
        {
            in = new FileInputStream("img1.jpg");
            out = new FileOutputStream("img1copy.jpg");
            int ch;
            while((ch = in.read()) != -1)
            {
                out.write(ch);
            }
            System.out.println("A copy is made successfully");
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File not present on the disk");
        }
        catch(IOException ioe)
        {
          System.out.println("Issue with peripheral hardware devices");
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
                System.out.println("Issue with peripheral hardware devices");
            }
        }
    }
}
