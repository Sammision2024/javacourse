import java.util.*;
public class Dequeuee
{
    public static void main(String args[])
    {
        Deque<Integer> dq=new ArrayDeque<Integer>();

        dq.offer(10);
        dq.offer(20);
        dq.offerLast(30);
        dq.poll();
        dq.offerFirst(40);//Add 40 at first position.
        dq.pollLast();//Delete Last Element.
        dq.pollFirst();//Delete First Element

       
        System.out.println(dq);
        
    }
}