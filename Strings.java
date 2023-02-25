/*
1)String in java it is class not a primitive datatype So for that it is write in captial S.
2)String cannot be changed. Because there is String Constant Pool in heap memory it will store only diifferent 
  string if string is same it will not store.
3)String Buffer and String Builder are two class used to implement mutable string.
 */

public class Strings
{
    public static void main(String arga[])
    {   
        // String name = "Santosh";  //This declaretion is used in most cases

        String name = new String("Santosh"); //this is how we create a String variable or String Object.
        System.out.println(name);
        System.out.println("hello " + name);
        System.out.println(name.charAt(1));         //give value of char at that index. 
        System.out.println(name.concat(" Good"));   //it will concatenate the string by useing concat function. 
        System.out.println(name.hashCode());        //It will print hashCode for name.

        String fname = "Santosh";
        fname=fname + " Sam";   //We are changeing the fname but not changeing the exiting String fname="Santosh".
        System.out.println("Hello " + fname);

        String s1="Santosh";
        String s2="Santosh";

        System.out.println(s1==s2);  


    }
}