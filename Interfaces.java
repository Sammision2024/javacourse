/* *********************Interface*******************************
1) Inteface is not a class.We can use interface in place of abstract.
2) By default every method in interface is public abstract.
3) Interface will give path or design/methods it will not implement methods.
4) We have to create a class for implement the interface methods by useing a implements(key word).
                  class B implements A,X;

5) It is complusory to a class which implementing the interface to define all methods of interface else that class 
   also become a abstract class.
6) By default all the variables in interface are Final and Static.
       int age; Throws an error assign value instantly it is final default.
7) We cannot instaneous the methods of interface.
8) Interface dont't have their own memeory.
9) one class can immplement more than one(multiple) interface.
10) We can extends(inherit) the interface.
      interface Y extends X;

11) class - class         --> extends.
    class - interface     --> implements.
    interface - interface --> extends


*/

interface  Bc
{   
    int age=21;
    void show();
    void config();
}

interface Mc
{
    void run();
}

class Gd implements Bc,Mc
{
    public void show()
    {
        System.out.println("In a show");
    }
    public void config()
    {
        System.out.println("In a config");
    }
    public void run()
    {
          System.out.println("Running");
    }
}
interface Y extends Mc
{

}



public class Interfaces
{
    public static void main(String args[])
    {   
        Bc obj;
        // obj=new A(); it will give error we cannot instataneous A because it is a interface not a class.
        obj=new Gd(); //we can only call the methods of A.Because A not have idea of run().
        obj.show();
        obj.config();
      
        System.out.println(Bc.age);
        Mc obj1=new Gd();
        obj1.run();
    }
}


