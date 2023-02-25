import java.util.*;
import java.util.function.Predicate;

/* **********************************************Stream filter()****************************************

*) filter needs object of Predicate.
*) Predicate belongs to pacakage (import java.util.function.Predicate);
*) Predicate is a interface have a method called test().test() return boolean values.
*) If from a Stream we apply a filter for a particular value if it is true it will go ahead.
   (real life example :- If we put filter in middle of river we will get only pure water) 

*/




public class Streamfilter
{
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        // Predicate<Integer> p= new Predicate<Integer> (){

        //     public boolean test(Integer n){
        //         if(n%2==0)
        //             return true;
        //         else
        //             return false;
        //     }
        // };

        Predicate<Integer> p=  n -> n%2==0;//By useing Lamda Expression.
     

        int result= nums.stream()
                        .filter(p)
                        .map(n->n*2)
                        .reduce(0,(c,e)->c+e);
        System.out.println(result);
    }
}