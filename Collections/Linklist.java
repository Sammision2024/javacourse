import java .util.*;
public class Linklist
{
    public static void main(String args[])
    {
        List<Integer> linklist=new LinkedList<>();
        linklist.add(0,20);
        linklist.add(1,10);
        linklist.add(2,30);
        linklist.remove(1);
        System.out.println(linklist);
    }
}