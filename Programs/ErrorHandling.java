/*
Five keywords with which you can handle exceptions
a. try
b. catch
c. finally
d. throw
e. throws
*/

import java.util.Scanner;
import java.io.*;

public class ErrorHandling
{
  public static void main(String args[])throws IOException
  {
    // String name = "Tejas";
    // String surname = "Shinde";
    // String result = name + " " + surname;
    // System.out.println(result);

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter first name : ");
    // String name = scanner.nextLine();
    // System.out.println("Enter last name ; ");
    // String surname = scanner.nextLine();
    // System.out.println("Full name is : " + name + " " + surname);


    try
    {
      FileReader in = new FileReader("d:/test.txt");//Will get error if not handled ot thrown (IOException thrown above)
      // char ch = in.read();
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Will get error if not handled ot thrown
      System.out.println("Please enter numerator : ");
      int numerator = Integer.parseInt(br.readLine());
      System.out.println("Please enter denominator");
      int denominator = Integer.parseInt(br.readLine());
    /*BufferedReader Exception Handling*/
    // System.out.println("Please enter numerator : ");
    // int numerator = scanner.nextInt();
    // System.out.println("Please enter denominator : ");
    // int denominator = scanner.nextInt();

    System.out.println("The quotient is : " + (numerator/denominator));
    }
    //Catch blok statements are cumpolsary
    catch(ArithmeticException ae)
    {
        System.out.println("Cannot divide by zero");
        throw ae;
        // ae.printStackTrace();
    }
    /*Should be the last clause
    - will be executed even if exception occurs or not.
    - We write a CLEANUP CODE in the finally block
    - Finally block is used to free the resources
    - for example, file connections or jdbc connections (We have to close each connection)
    - in a networking program, you have to close the 'socket'
    - Finally block will be executed whether error occurs or not
    - Final block will be executed even if there is a 'return' statement in a method above the same
    */
    finally
    {
      System.out.println("In finally block");
    }
  }
}
