/*
throw :- Throws the error/Exception to the catch block according to the condition.

*/


class Santoshexception extends Exception//Own Exception.
{
    public Santoshexception(String string)
    {  
        super(string); //it will pass through Exception class constructor.       
       
    }
}

public class Throwkeyword
{
    public static void main(String args[])
    {
        int i=20;
        int j=0;
       

    //    try 
    //    {
    //     j=18/i;
    //     if(j==0)
    //     {
    //         throw new ArithmeticException("Don't want to print Zero");//throweing the error to catch block.throw is object.
    //     }
    //    }

    //    catch(ArithmeticException e)
    //    {

    //     j=18/1;              //Default output(If exceptions happen).
    //     System.out.println("Thats the default output...");
    //     System.out.println(e);

    //    }
//**********************************************Creating Own Exception*************************************** */
    try 
       {
        j=18/i;
        if(j==0)
        {
            throw new Santoshexception("Don't want to print Zero");//throeing the error to catch block.throw is object.
        }
       }

       catch(Santoshexception e)
       {

        j=18/1;              //Default output(If exceptions happen).
        System.out.println("Thats the default output...");
        System.out.println(e);

       }

       System.out.println(j);
       System.out.println("Bye");


    }
}