import java.util.*;
import java.util.stream.Stream;


/* **********************************************Stream filter()****************************************

*)  reduce() takes two parameters(Type,Operations(Binary operator).
*)  reduce(0,(c,e)->c+e);
    c,e :- Where c is the carry and e is the element.

*/




public class Streamreduce
{
    public static void main(String args[])
    {
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        // int result= nums.stream()
        //                 .filter(n->n%2==0)
        //                 .map(n->n*2)
        //                 .reduce(0,(c,e)->c+e);
        // System.out.println(result);

        Stream<Integer> sortedValues= nums.stream()
                                          .filter(n->n%2==0)
                                          .sorted();
                        
        sortedValues.forEach(n->System.out.println(n));


        
     
    }
}