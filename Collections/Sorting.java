
/*

Comparator :- Is used for developing own logic.

*) Comparator is an Interface.
*) For our own logic pass object com.
*) Collections works with the wrapper classes.
*) Comparator<Students> com = new Comparator<Students>() //We can use Comparator or Comperable.
*) class Students implements Comparable <Students>//We are compareing Students.
*) Compareable is used to give power to class compare itself.
*) Comparator is used to develop own logic for sorting and for other things.


*/

import java.util.*;

class Students implements Comparable <Students>//We are compareing Students.For natural sorting Compareable is imp.
{
    int age;
    String name;

    public Students(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    public String toString()
    {
        return "Student [age " + age +",name = " + name +"]";
    }
    
    public int compareTo(Students that)//it is method which belong to Comperable class.
    {
        if(this.age > that.age)//Defineing the method in class itself so we can use this keyword.
        {
              return 1;
        }
        else
        {
            return -1;
        }
    }

}
public class Sorting
{
    public static void main(String args[])
    {
       // Comparator<Integer> com = new Comparator<Integer>()//Comparator is an interface.
        // {
        //     public int compare(Integer i,Integer j)//Should pass the class name.
        //     {
        //         if(i%10 > j%10)
        //         {
        //             return 1;
        //         }
        //         else
        //         {
        //             return -1;
        //         }
        //     }
        // };

        

        // List<Integer> nums=new ArrayList<>();
        // nums.add(44);
        // nums.add(74);
        // nums.add(59);
        // nums.add(23);
        // nums.add(16);
        // nums.add(17);
        // nums.add(11);

        // Collections.sort(nums,com);  //Collections is a class and have a lot of methods.

        List<Students> studs=new ArrayList<>();
        studs.add(new Students(21,"Sam"));
        studs.add(new Students(28,"Santosh"));
        studs.add(new Students(29,"Sunil"));
        studs.add(new Students(22,"Sanju"));

        // Collections.sort(studs,com);    //This is for Comparator.

        Collections.sort(studs);       //This is for Comperable no need to pass object.
        System.out.println(studs);

        for(Students st:studs)
        {
             System.out.println(st);

        }

    }
}