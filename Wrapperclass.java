/* ***********************************************Wrapper class******************************************

*) For Every Primitive type we have a class.

1) int     -> Integer(class extends the object class).
2) char    -> Character
3) double  -> Double

>>Boxing
        int num =7;     
        Integer num1=new Integer(num);

    Now we are takeing primitive(num) value and storeing that in an wrapper or class object(num1) this is called
    Boxing.

>> AutoBoxing   
        int num =7;     
        Integer num1=num;

    Primitive data converting in to object(num1) automatically is this is called AutoBoxing.

>>UnBoxing
       int num =7;
       Integer num1=num;
       int num2=num1.intValue();

    Object type to primitive type.This is called Unboxing.

>>Auto-Unboxing
        int num =7;
        Integer num1=num;
        int num2=num1;

    Object type to primitive type it is working automatically is called Auto-Unboxing.


*/

public class Wrapperclass
{
    public static void main(String args[])
    {
        int num =7;     // How to store this value in a class type.Class we have called Integer.

        // Integer num1=new Integer(num);//Now we are takeing primitive value and storeing that in an object.

        Integer num1=num;

        // int num2=num1.intValue();//Object type to primitive type.This is called Unboxing.
        int num2=num1;//Object type to primitive type it is working automatically is called Auto-Unboxing.

        // Integer num1=8;  //Where num1 is the Reference variable or object.

        System.out.println(num2);
    }
}