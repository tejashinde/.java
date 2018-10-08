class Company
{
    String name;
    String type; //Multinational,Domestic

    public Company(){}

    public Company(String name, String type)
    {
        this.name = name;
        this.type = type;
    }

    void DisplayDetails()
    {
        System.out.println("Name : " + name + " Type : " + type);
    }
}

class ABC extends Company
{
    int turnover; //In crores
    int no_of_employees;

    public ABC(String name, String type , int turnover , int no_of_employees)
    {
        super(name,type); // Will get variables from the parent class
        this.turnover = turnover;
        this.no_of_employees = no_of_employees;
    }

    void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println("Turnover : " + turnover + "Number of employees in " + name + " are " + no_of_employees);
    }
}

public class CompanyMain
{
    public static void main(final String args[])
    {
        //Reference of Parent class and Object of child class
        Company abc = new ABC("IBM Cloud" , "Multinationl" , 50 , 95000);
        // company.DisplayDetails();
        System.out.println("------- ABC Class Method ------");
        abc.DisplayDetails();
    }
}
