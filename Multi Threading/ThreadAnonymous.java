public class ThreadAnonymous
{
    public static void main(String args[])
    {
        Thread evenThread = new Thread()
        {
            public void run()
            {
              for (int i = 0 ; i < 10 ; i += 2)
              {
                  System.out.print("Even");
                  System.out.println(i);
                  try
                  {
                        Thread.sleep(2000);
                  }
                  catch(InterruptedException ie)
                  {
                      System.out.println("Process Interrupted");
                  }
              }
            }
        };
        evenThread.start();
        Thread oddThread = new Thread()
        {
            public void run()
            {
              for (int i = 1 ; i < 10 ; i += 2)
              {
                  System.out.print("Odd");
                  System.out.println(i);
                  try
                  {
                        Thread.sleep(2000);
                  }
                  catch(InterruptedException ie)
                  {
                      System.out.println("Process Interrupted");
                  }
              }
            }
        };
        oddThread.start();
    }
}
