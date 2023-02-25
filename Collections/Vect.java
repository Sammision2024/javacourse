/*
Vector is Synchronized :- Thread Safe.
ArrayList is Non-Synchronized :- No Thread Safe.



*/

import java.util.*;

public class Vect
{
    public static void main(String args[])
    {
        Vector<String> vector=new Vector<String>();
        vector.add("1"); 
        vector.add("4"); 
        vector.add("3");

        System.out.println(vector); 
    }
}