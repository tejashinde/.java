class CallMethod
{
    public void print(String message)
    {
        synchronized (this)
        {
            public void print(String message)
            {
                System.out.print("[ " + message);
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
}
//
// public class Synchronization
// {
//     public Synchronization(String message,)
// }
