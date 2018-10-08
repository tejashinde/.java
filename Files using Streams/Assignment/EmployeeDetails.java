import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Employee
{
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(Employee eArr[])
    {
        for(Employee e:eArr)
        {
            System.out.println(e);
        }
        // System.out.println(this.id + " " + this.name + " " + this.salary);
    }

    public String toString()
    {
        return(id + " " + name + " " + salary);
    }
}

public class EmployeeDetails
{
    public static void main(String args[])
    {
        Employee[] empArray = new Employee[5];
        BufferedReader in = null;
        try
        {
            double sumSalary = 0;
            in = new BufferedReader(new FileReader("textAssignment.txt"));
            String data;
            int counter = 0;
            while((data = in.readLine()) != null)
            {
                String dataArr[] = data.split(" ");
                int sId = Integer.parseInt(dataArr[0]);
                String sName = dataArr[1];
                double sSalary = Double.parseDouble(dataArr[2]);
                sumSalary = sumSalary + sSalary;
                empArray[counter] = new Employee(sId,sName,sSalary);
                System.out.println(empArray[counter]);
                counter ++;
            }
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
    }
}
