import java.io.*;

class commandLine{
    
    public static void main(String args[])
    {
    String Name,Surname;
        
    Name = args[0];
    Surname = args[1];  
        
    System.out.println(Name.charAt(Name.length() - 1));
    System.out.println(Surname.charAt(Surname.length() - 1));
    }
}
