/*
Upcasting :-  A obj = (A) new B(); //Upcasting(Goeing Up object is of subclass assigning to Parent class)
Downcasting :- Reference of parent class assisnging to subclass.
*/

class S
{
    public void show1()
    {
        System.out.println("In A Show");
    }
}

class T extends S
{
    public void show2()
    {
        System.out.println("In B Show");
    }
}

public class Upcastdowncast
{
    public static void main(String args[])
    {
        S obj = (S) new T(); //Upcasting(Goeing Up object is of subclass assigning to Parent class).
        obj.show1();

        /*
         obj.show12(); We cannot called show2 because reference is of class A and Class A not have idea of show2().
         So for this Downcasting required.
        
        */

        T obj1 = (T) obj; //Downcating :- Reference of parent class assisnging to subclass.
        obj1.show2();
    }
}