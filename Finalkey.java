/*
   Final keyword can use with Variable,Method ans class
1) If we assign final keyword we cannot change the value.

*/

// final 
class Calc
{
     public final void show()
    {
        System.out.println("By Santosh");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

class Advancal extends Calc // It will give error because Calc is final we cannot inherit it.
{
    // public void show()
    // {
    //     System.out.println("By John");
    // }

}

public class Finalkey
{
    public static void main(String args[])
    {
        // final int num=8; // We have use final keyword now it is constant we cannot change.
        // num=9 it will give error
        
        Advancal obj=new Advancal();
        
        // obj.show();   //Its changeing the method features implementation of add is by santosh but it showing john.By applying final keyword it will not change.
        
        obj.add(4,4);
       
    }
}