class Counter
{   
     int count;
    public synchronized void  increment()
    {
        count++;
    }
}

public class Raceconditions
{
    public static void main(String args[])
    {
        Counter c=new Counter();

        Runnable obj1 = ()  ->                        //Runnable is a fuctional interface and we can use lambda exp.
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
            }
        };
        Runnable obj2= () ->                        //Runnable is a fuctional interface and we can use lambda exp.
        {
            for(int i=1;i<=10000;i++)
            {
                c.increment();
               
            }
        };

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        
        t1.start();
        t2.start();
        try
        {
        t1.join();
        /*
        Join is aspecial method which allows our main thread to wait for others thread to comeback
        
        */ 
        t2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(c.count);


     
    
    }

}