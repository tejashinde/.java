import java.io.FileWriter;
import java.io.IOException;
public class FilesUsingFileWriter
{
    public static void main(String args[])
    {
        FileWriter out = null;
        String name = "Tejas";
        String surname = "Shinde";
        try
        {
            out = new FileWriter("testwrite.txt");
            out.write(name + " " + surname);
        }
        catch(IOException ioe)
        {
            System.out.println("Issues with certain peripheral hardware devices");
        }
        finally
        {
            try
            {
                out.close();
            }
            catch(IOException ioe)
            {
                System.out.println("Issues with certain peripheral hardware devices");
            }
        }
    }
}
