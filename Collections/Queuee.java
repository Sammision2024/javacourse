/*

Queeu :- If we make data with priority.
Queue :- First in First Out.(Order will same first entered element will delete.).

*/

import java.util.*;

public class Queuee
{
    public static void main(String args[])
    {
        
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.offer(3);//add the element by offer.
        queue.add(6);
        queue.offer(8);
        queue.add(10);//By useing add sometimes queue through exception.
        System.out.println(queue.peek());
        queue.poll();//Remove 3 because 3 comes first.
        queue.remove();
        System.out.println(queue);
    }
}