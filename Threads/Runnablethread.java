/* 

  class A extends Thread   //Thread is a class which implements Runnable and Runnable have run() method.
  But start() will not work.Runnable not have a start method().
* create new thread for start(Problem solved).
* Thread t1=new Thread(obj1); //Thread have constructor which take runnable object.
* t2.start(); //But it will not get output.
*/

//class A extends Thread   //Thread is a class which implements Runnable and Runnable have run() method.

class A implements Runnable
{
    public void run()
    {   
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
        }
    }
}
class B implements Runnable
{
    public void run()
    {   
        for(int i=0;i<10;i++)
        {
             System.out.println("Hello");
        }
    }
}

public class Runnablethread
{
    public static void main(String args[])
    {
        // A obj1=new A();
        // B obj2=new B();
        
        Runnable obj1=new A();
        Runnable obj2=new B();

       Thread t1=new Thread(obj1); //Thread have constructor which take runnable object.
       Thread t2=new Thread(obj2);

        t1.start();
        t2.start(); //But it will not get output.
         
    }
}