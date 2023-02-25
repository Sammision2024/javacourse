/*
****************************Exceptions Handling********************************************
>> Types of Errors
1) Compile Time Error (Easy to solve by compiler suggestions).
2) Run Time Error (Every thing is working code also working because of some resons code suddenly stop execution).

*  Example :- Program finding the file and that file is deleted by you then that error is called Runtime erroe,
              When file is present in system it is working properly.
* Suppose a plane is in air and suddendly enngine is stop working it create a big problem.
* Such Runtime Errors are called Exceptions.We should handle the exceptions this called Exceptions Handling.

* Types of statement should we handle.
1) Normal   :- Impact is not much seviour.
2) Critical :- Impact of promblem is seviour.

3) Logical Error (Every thing is working properly but getting Unexpected output).


*/

public class Exceptionshand
{
    public static void main(String args[])
    {
        int i=0;
        int j=0;
        int nums[]=new int[5];

        //hey java try to execute.
        try 
        {

            j=18/i; //if exceptions handle the exceptions and throw to the catch block.

        }
        catch(Exception e)//try will throw exceptions in the form of object(Exception(is a class) e(object)).
        {
            System.out.println("Cannot Divide By Zero.....");//if exceptions this statement will exceute.

            System.out.println(e);//give type of exceptions(java.lang.ArithmeticException: / by zero).
        }

        try
        {
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.....");
            System.out.println(e);
        }

        System.out.println(j);

        System.out.println("Bye");
    
    }
}



