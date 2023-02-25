public class Turnaryop
{
    public static void main(String args[])
    {
        int n=8;
        int result=0;

    /*   if(n%2==0)
        {
            result=10;
        }
        else
        {
            result=20;
        }

        System.out.println(result);
    */
    
    // TUrnary Operator(?(If condition is true):(if it is false))

    result=n%2==0?10:20;
    
    System.out.println(result);

    }

}