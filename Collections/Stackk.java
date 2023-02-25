/*

Stack :- last in first out.
Stack is Ordered and Synchronized(Thread Safe).
Stack extend Vector;

*/

import java.util.*;

public class Stackk
{
    public static void main(String args[])
    {
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(10);
        stack.push(10);
        stack.push(20);
        System.out.println(stack);
        
        System.out.println(stack.peek());//Top element last entered element.
        stack.pop();
        System.out.println(stack);



    }
}