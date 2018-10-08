public class GenericMethod
{
    public static <Generic,xGeneric> void display(Generic generic,xGeneric xgeneric)
    {
        System.out.println(generic + " " + xgeneric);
    }

    public static void main (String args[])
    {
        // display("Tejas",10);
        // display(10,"Tejas");
        Employee employee = new Employee(55,"Tejas");
        display(employee,"");
    }
}

class Employee
{
    private int employeeNumber;
    private String employeeName;
    public Employee(){}
    public Employee(int employeeNumber, String employeeName)
    {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
    }
}
