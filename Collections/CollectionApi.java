/* ***************************************Collections*****************************************
*) # TYpes of collections.

1)Collection API (concept)
2)Collection     (Interface)
3)Collections    (Class)

Collection :- Group of Elements.We can use inbuilt class and data structures.

*) By default collection API is work with objects.
*) By useing generics always mention type<Integer ,etc>.It also reduce bugs or Run time errors.

*******************************List implement collection(ArrayList extends List,Collection)***********************
*) List also supports collections of same values.

*******************************Set implement Collection(HashSet extends Set,Collection)****************************
*) Set Support uniques values.
*) Set does not follow sequence.
*) Set does n't have a index value.
*) Set is collection of unique value.
*) Set is also called Collection Framework.
*) For sorted values we can use TreeSet<>();


*/
import java.util.*;

public class CollectionApi
{
    public static void main(String args[])
    {

    //    Collection<Integer> nums=new ArrayList<Integer>();
    //    List<Integer> nums=new ArrayList<Integer>(); //if we want fetch index,fetch element from index List is good
    //    Set<Integer> nums=new HashSet<Integer>();//set extend collection and HashSet impleement set,collection.

        Set<Integer> nums=new TreeSet<Integer>(); //It will give sorted values.
        
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
        // System.out.println(nums.get(2));
        // System.out.println(nums.indexOf(2));
    }
}