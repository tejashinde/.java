//Author : Tejas Ashok Shinde
//Date : August 30th 2018

interface A
{
  void aMethod(); //public abstract by default
}

interface B
{
  void bMethod();
}

// interface mega extends A,B
// {
//   void megaMethod();
// }

class InterfaceClass implements A,B
{
  public void displayMethod()
  {
    System.out.println("displayMethod");
  }
  @Override
  public void aMethod()
  {
    System.out.println("aMethod");
  }

  @Override
  public void bMethod()
  {
    System.out.println("bMethod");
  }
}

public class InterfacePractice
{
  public static void main(String args[])
  {
    A objA = new InterfaceClass();//upcasting
    InterfaceClass icobj = (InterfaceClass) objA;//Downcasting the object

    InterfaceClass interfaceObj = new InterfaceClass();
    interfaceObj.displayMethod();
    interfaceObj.aMethod();
    interfaceObj.bMethod();
  }
  System.gc();
}
/*
The Overriding method must have the same or broader access
specifier of that of overriden method
*/
