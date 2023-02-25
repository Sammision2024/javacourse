import java.util.*;
import java.util.List;

public class Lists
{
    public static void main(String args[])
    {
        List<Integer> nums=new ArrayList<Integer>(); //if we want fetch index,fetch element from index List is good.
        // ArrayList<Integer> nums=new ArrayList<Integer>(); //Good practise to write this.
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(10);//set will print only 2 one time.

        
        
        for(int n:nums) //Give Error because nums is object cannot store in integer.Use angualr brackets for type.
        {
            System.out.println(n);
        }

        System.out.println(nums);
        
    }
}