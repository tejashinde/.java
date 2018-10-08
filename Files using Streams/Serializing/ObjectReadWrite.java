import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;

class Employee implements Serializable
{
    private int id;
    private String name;
    private transient double salary; //They will be stored in the current local memory

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void DisplayEmployeeDetails()
    {
        System.out.println("Name : " + this.name + "\nID : " + this.id + "\nSalary : " + this.salary);
    }

    public String toString()
    {
        return(id + " " + name + " " + salary);
    }
}

public class ObjectReadWrite
{
    public static void main(String args[])
    {
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try
        {
          Employee e = new Employee(1,"Anita",2000);
          fout = new FileOutputStream("employee.dat");
          out = new ObjectOutputStream(fout);
          out.writeObject(e);
          e = new Employee(1,"Tejas",3000);
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File not found on the disk");
        }
        catch (IOException ioe)
        {
            System.out.println("Issues with the hardware peripheral devices");
        }
        finally
        {
            try
            {
                out.close();
            }
            catch (IOException ioe)
            {
                System.out.println("Issues with the hardware peripheral devices");
            }
        }
        try
        {
            fin = new FileInputStream("employee.dat");
            in = new ObjectInputStream(fin);
            while(fin.available() > 0)
            {
                Employee obj = (Employee)in.readObject();
                System.out.println(obj);
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File not found on the disk");
        }
        catch (IOException ioe)
        {
            System.out.println("Issues with the hardware peripheral devices");
        }
        catch(ClassNotFoundException cnfe)
        {
            System.out.println("ClassNotFoundException");
        }
        finally
        {
            try
            {
                fin.close();
                in.close();
            }
            catch (IOException ioe)
            {
                System.out.println("Issues with the hardware peripheral devices");
            }
        }
    }
}
