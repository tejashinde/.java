class Basket
{
    private int number;
    private boolean flag = true;
    public Basket(){}
    public synchronized void put(int number)
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
        this.number = number;
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException ie)
        {
            System.out.println("Process Interrupted.");
        }
        System.out.println("Put : " + number);
        flag = false;
        notify();
    }
    public synchronized int get()
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
        System.out.println("Got : " + number);
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
        return number;
    }
}

class ProducerThread extends Thread
{
    Basket basket;
    public ProducerThread(Basket basket)
    {
        this.basket = basket;
    }

    public void run()
    {
        int number = 0;
        while(number < 10)
        {
            number ++;
            basket.put(number);
        }
    }
}

class ConsumerThread extends Thread
{
    Basket basket;
    public ConsumerThread(Basket basket)
    {
        this.basket = basket;
    }

    public void run()
    {
        while(true)
        {
            basket.get();
        }
    }
}

public class SharedResources
{
    public static void main(String args[])
    {
        Basket basket = new Basket();
        ProducerThread mProducerThread = new ProducerThread(basket);
        ConsumerThread mConsumerThread = new ConsumerThread(basket);
        mProducerThread.start();
        mConsumerThread.start();
    }
}
