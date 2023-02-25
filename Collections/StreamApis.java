/* **********************************************Stream***************************************************

Stream :- Stream is an interface.

*) stream() returns the object of the stream.
*) Stream<Integer> s1=nums.stream();//All the values available in the nums now we can get imn s1.
*) The changes we made in Stream objetc it will not affect actual list.
*) Once we use the Stream we cannot reuseit(Disadvantage).
*) Stream provides lots of method(Advantage).


*/


import java.util.*;

public class StreamApis
{
    public static void main(String args[])
    {
        // List<Integer> nums=new ArrayList<Integer>();
        //asList() is the method which gives a List.asList belong to a class Arrays.

        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        // Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2=s1.filter(n-> n%2==0);
        // Stream<Integer> s3=s2.map(n-> n*2);
        // int result=s3.reduce(0, (c,e)->c+e);//reduce will not give new stream its a give a integer value.We cannot use
        
        int result = nums.stream()//Dont give semicolon till end.
                        .filter(n -> n%2==0)
                        .map(n ->n*2)
                        .reduce(0,(c,e)->c+e);
        System.out.println(result);           




        /*
        *) All the values available in the nums now we can get in s1.
        
        */
        

        // nums.forEach(n->System.out.println(n));

        // s1.forEach(n->System.out.println(n));//It will give erroe Stram can use only once. 
        // s2.forEach(n->System.out.println(n)); 
        // s3.forEach(n->System.out.println(n));
        // System.out.println(result); //forEach().Because reduce will give a single value.
        
     
   
   
   }
}