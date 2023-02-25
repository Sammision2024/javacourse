import java.util.*;
import java.util.function.Function;

/* **********************************************Stream map()****************************************

*) map need object of Function.
*) Function is a Functional Interface which take two types 
   Function<Integer(take type),Integer(return type)> fun=new Function<Integer,Integer>().
  
*) It contain apply() method.
*) Function belongs to pacakge (import java.util.function.Predicate;).

  // Function<Integer,Integer> fun=new Function<Integer,Integer>(){

        //     public Integer apply(Integer n){
        //         return n*2;//Logic can be anything.We takeing just for understanding.
        //     }
        // };

    //Function<Integer,Integer> fun=n ->  n*2;//By Lamda Expression.

*/




public class Streammap
{
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        // Function<Integer,Integer> fun=new Function<Integer,Integer>(){

        //     public Integer apply(Integer n){
        //         return n*2;//Logic can be anything.We takeing just for understanding.
        //     }
        // };
        Function<Integer,Integer> fun=n ->  n*2;//By Lamda Expression.
            
        
       
     

        int result= nums.stream()
                        .filter(n->n%2==0)
                        .map(fun)
                        .reduce(0,(c,e)->c+e);
        System.out.println(result);
    }
}