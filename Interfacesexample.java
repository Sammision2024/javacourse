/*
****Need of Interface****
1)Interface is used to develop design which is lossely coupled.Observe below code Develope object is not depend on 
  Laptop or Desktop it depend on computer.

*/
interface Computerss
{
    public void code();
   
}

class Laptopp implements Computerss
{
    public void code()
    {
        System.out.println("Code,Compile,run");
    }
}

class Desktop implements Computerss
{
    public void code()
    {
        System.out.println("Code,Compile,run : Faster");
    }
}


class Developer
{
    public void devApp(Computerss lap) // It will make issue so use of interface will good.
    {
        lap.code();
    }
}


public class Interfacesexample
{
    public static void main(String args[])
    {   
        Computerss lap=new Laptopp();
        Computerss desk=new Desktop(); //Getting interface reference.

        Developer santosh=new Developer();
        santosh.devApp(desk); //it will not work devapp() takeing object of laptop class.
        santosh.devApp(lap);
    
    
    }
}