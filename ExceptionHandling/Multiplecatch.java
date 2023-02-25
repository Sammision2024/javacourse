
public class Multiplecatch
{
    public static void main(String args[])
    {
        int i=9;
        int j=0;
        int nums[]=new int[5];
        // String str=null;

        
        try 
        {

            j=18/i;                      //if exception happen then it will not check next conditions
            // System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            System.out.println(nums[0]);

        }

        catch(ArithmeticException e)               //ArithmeticException is a class.
        {
            System.out.println("Cannot Divide By Zero.....");
        }

        catch(ArrayIndexOutOfBoundsException e)   //ArrayIndexOutOfBoundsException is a class.
        {
            System.out.println("Stay in our limit");
        }
        
        //Exception is a parent class of all Exceptions it can handle any Exceptions(Always declare at bottom).
        catch(Exception e)
        {
            System.out.println("Something went wrong......");
            System.out.println(e);
        }
        

        System.out.println(j);

        System.out.println("Bye");
    
    }
}



