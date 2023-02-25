/*
Set
| |-> HashSet(Implements)
| |->LinkedHashSet(Implements){Unique and in iordered}                   
|->SortedSet(extend)
        |
        |->TreeSet(Implements){Unique and Sorted}


*/

import java.util.*;

public class Sets
{
    public static void main(String args[])
    {

    
    //    Set<Integer> nums=new HashSet<Integer>();//set extend collection and HashSet impleement set,collection.

        // Set<Integer> nums=new TreeSet<Integer>(); //It will give sorted values.
        // Set<Integer> nums=new HashSet<Integer>();
        // LinkedHashSet<Integer> nums=new LinkedHashSet<Integer>();//Unique and Inordered.
        TreeSet<Integer> nums=new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
        nums.add(2);//set will print only 2 one time.

        Iterator<Integer>values=nums.iterator();//iterator() will give Iterator object(values).

        while(values.hasNext())//hasNext() tells do we have next element or not.
        {
            System.out.println(values.next());//next() give the nect element.
        }
        
        for(int n:nums) //Give Error because nums is object cannot store in integer.Use angualr brackets for type.
        {
            System.out.println(n);
        }

        System.out.println(nums);
       
    }
}