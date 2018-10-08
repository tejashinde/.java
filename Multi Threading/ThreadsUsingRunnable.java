class CustomThread implements Runnable
{
      private int start;
      private int end;
      private String name;
      Thread thread;
      public CustomThread(int start, int end, String name)
      {
          this.start = start;
          this.end = end;
          this.name = name;
          thread = new Thread(this);
          thread.start();
      }

      @Override
      public void run()
      {
          for (int i = start ; i < end ; i += 2)
          {
              System.out.println(name + " " + i);
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
}
class ThreadsUsingRunnable
{
    public static void main(String args[])
    {
        CustomThread oddThread = new CustomThread(1,10,"Odd");
        CustomThread evenThread = new CustomThread(0,10,"Even");
        try
        {
            oddThread.join();
            evenThread.join();
        }
        catch(InterruptedException ie)
        {
            System.out.println("Process Interrupted");
        }
    }
}
