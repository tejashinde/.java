class ResourcePool
{
    private String message;
    private boolean flag = true;
    public ResourcePool(){}
    public synchronized void send(String message)
    {
        while(!flag)
        {
            try
            {
                wait();
            }
            catch(InterruptedException ie)
            {
                System.out.println("Process Interrupted.");
            }
        }
        this.message = message;
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Process Interrupted.");
        }
        System.out.println("Sent : " + message);
        flag = false;
        notify();
    }
    public synchronized String receive()
    {
        while(flag)
        {
            try
            {
                wait();
            }
            catch(InterruptedException ie)
            {
                System.out.println("Process Interrupted.");
            }
        }
        System.out.println("Got : " + message);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Process Interrupted.");
        }
        flag = true;
        notify();
        return message;
    }
}

class SenderThread extends Thread
{
    ResourcePool resourcePool;
    public SenderThread(ResourcePool resourcePool)
    {
        this.resourcePool = resourcePool;
    }

    public void run()
    {
        String[] packets = {"Hi", "How", "are", "you", "End"};
        for(String packet : packets)
        {
            for(int number = 0; number < packets.length ; number ++)
            {
                resourcePool.send(packets[number]);
            }
        }
    }
}

class RecieverThread extends Thread
{
    ResourcePool resourcePool;
    Basket basket;
    public RecieverThread(ResourcePool resourcePool)
    {
        this.resourcePool = resourcePool;
    }

    public void run()
    {
        while((resourcePool.receive()).equals("End"))
        {
            resourcePool.receive();
        }
    }
}

public class Messages
{
    public static void main(String args[])
    {
        ResourcePool resourcePool = new ResourcePool();
        RecieverThread mRecieverThread = new RecieverThread(resourcePool);
        SenderThread mSenderThread = new SenderThread(resourcePool);
        mRecieverThread.start();
        mSenderThread.start();
    }
}
