class CustomThread extends Thread
{
    private int start;
    private int end;
    public CustomThread(String name, int start, int end)
    {
        super(name);
        this.start = start;
        this.end = end;
        start(); //calling start method from the parent class
    }
    //Override helps us understand the signature of the parent class (Whether it is the same as perent's)
    @Override
    public void run()
    {
        for(int i = start ; i < end ; i += 2)
        {
            System.out.print(" " + getName() + " " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println("Execution interrupted.");
            }
        }
    }
}

public class SequentialExecution
{
    public static void main(String args[])
    {
        System.out.println("Start");
        CustomThread customThreadEven = new CustomThread("Even" , 0 , 10);
        CustomThread customThreadOdd = new CustomThread("Odd" , 1 , 10);
        customThreadEven.start();
        customThreadOdd.start();
        //Returns if process is alive or not
        System.out.println("Even : " + customThreadEven.isAlive());
        System.out.println("Odd : " + customThreadOdd.isAlive());
        try
        {
            customThreadEven.join();
            customThreadOdd.join();
        }
        catch (InterruptedException ie)
        {
            System.out.println("Execution interrupted.");
        }
        System.out.println("Even : " + customThreadEven.isAlive());
        System.out.println("Odd : " + customThreadOdd.isAlive());
        System.out.println("End");
    }
}
