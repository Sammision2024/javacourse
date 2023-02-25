import java.util.*;

public class Priorityqueuee
{
    public static void main(String args[])
    {
        // PriorityQueue<Integer> pq=new PriorityQueue<Integer>();//By default priority queue is minimum.
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());//Give max.
        pq.offer(12);
        pq.add(7);   
        pq.add(3);   
        pq.offer(9);   
        pq.offer(2); 

        for(int n:pq)
        {   
            
            System.out.println(n);
            break;
        }

          
           
        System.out.println(pq);    
    }
}