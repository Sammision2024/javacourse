/*
   EnumMap
    |
    |--HashMap
    |
   AbstractMap(extend Enummap and HashMap & implement Map)
        |
       Map
        |
        |
      SortedMap(extend Map)
        |
        |
    NavigableMap(extend SortedMap)
        |
        |
    TreeMap(implement NavigableMap){Sort the keys}
*/


import java.util.*;

public class Mapp
{
    public static void main(String args[])
    {
        // Map<String,Integer> students=new HashMap<>();
        // HashMap<String,Integer> students=new HashMap<String,Integer>();//Not print in order.
        TreeMap<String,Integer> students=new TreeMap<String,Integer>();
        students.put("Sam",56);
        students.put("Sushil",26);
        students.put("Santosh",34);
        students.put("Saurabh",78);
        students.put("Amol",21);
        students.put("Sushil",45);    //key cannot be repeated.Keys are unique.Values can repeated.

        System.out.println(students); //It will print all key and values.But not in sorted manner.
        // System.out.println(students.get("Santosh"));  //give the value for harsh.

        // System.out.println(students.keySet());//gives all the keys.
        // System.out.println(students.values());//gives all the values.

        // for(String key:students.keySet())
        // {
        //     System.out.println(key + " : " + students.get(key));
        // }
        
      

        
        
    }
}