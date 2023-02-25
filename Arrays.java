/*
Arrays :-Holds Multiple values of similar datatypes.
int num[]={5,6,7};
int num[]=new int[4];//if we dont the values we can specify the size by new.

*/
import java.util.*;


public class Arrays
{
    public static void main(String args[])
    {
        // int nums[]={3,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int a=sc.nextInt();

        int nums[]=new int [a];

        System.out.println("Enter the Elements of an array ");      
        for(int i=0;i<a;i++)
        {
            nums[i]=sc.nextInt();
        }
        sc.close();

        System.out.println("Printing the Elements of an array ");    
        for(int i=0;i<nums.length;i++)
        {
            if((nums[i]%2)==0)
            {

            System.out.println(nums[i]);
            
            }
        
        }
        

    }

    public static List<Integer> asList(int i, int j, int k, int l, int m, int n) {
        return null;
    }
}