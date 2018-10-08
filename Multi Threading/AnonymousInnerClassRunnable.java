public class AnonymousInnerClassRunnable
{
    public static void main(String args[])
    {
        Thread CustomThread = new Thread(
        new Runnable()
        {
            public void run()
            {
                System.out.print("Even numbers : ");
                for (int i = 0; i < 10 ; i += 2)
                {
                    System.out.println(i);
                }
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
        );
        CustomThread.start();
    }
}
