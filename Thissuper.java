/*

1)if one class is inherit from other class and both have constructor then if object is created of subclass  then it is called both construcotr of super class and subclass also.
2)super() means call the constructor of super class.
*If we pass super() it call the default constructor of superclass.
*If we pass super(n) passeing value it call the parameterized constructor of superclass.
*super class super() will called the Object class which is default.

class A extends Object
{

}


 */




class K extends Object
{

    public K()
    {   super();
        System.out.println("In A");

    }
    public K(int a)
    {   super();
        System.out.println("In A int");

    }
}
class L extends K
{   
    public L()
    {   super();//it will execute the default constructor of class A.
        System.out.println("In B");

    }
   
    public L(int n)
    {   
        // this();//this method will execute the constructor of same class.
        System.out.println("In B int ");

    }

}

public class Thissuper
{   
    public static void main(String args[])
    {
    //    K obj=new K(6);// it will call default constructor of a if we not pass vlaue in super().
    //    K obj=new K(9);//it will call default constructor of both class if we not pass value in super().
       
    }

}