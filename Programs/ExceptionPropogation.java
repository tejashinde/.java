public class ExceptionPropogation
{
  public static void method1()
  {
    int x = 10/0;
  }
  public static void method2()
  {
    method1();
  }
  public static void method3()
  {
    method2();
  }
  public static void main(String args[])
  {
    try
    {
      method3();
    }
    catch(ArithmeticException ae)
    {
      System.out.println("Cannot divide by zero "); //User friendly exception line
      ae.printStackTrace(); //Will give you the proper stack trace i.e From where is the error coming in the code
    }

  }
}
