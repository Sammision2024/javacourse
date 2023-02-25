/*

1) We want to only declare the method abstract key word sholud use.
    public abstract void drive();

2) abstract method can only belong to abstract class.
3) We cannot create object of a abstract class.
4) The class which extending the abstract it is compulsory to define the abstract method.
5) abstract class have abstract method It is not compulsory.
6) The class which extending the abstract it is compulsory to define the abstract method if it is failed to define.
   Then it also become abstract class.

*/

abstract class Car
{
    public abstract void drive();
    // public abstract void fly();
    
    public void playMusic()
    {
        System.out.println("Play Music");
    }
}

class Nexon extends Car     //Concrete class.
{
    public void drive()
    {
        System.out.println("Driveing...");
    }
//    public  void fly()//Give error because fly is only declare not define.
    
   
}

public class Abstractkeyword
{
    public static void main(String args[])
    {
        Car obj = new Nexon();   //Refersnce of Car(abstract class).
        obj.drive();             //it will call drive anywhere it is declared.
        obj.playMusic();
    }
}

