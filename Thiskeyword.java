/*

This keyword :- This is a keyword which represent the current object.By useing This keyword we can assign the value to variable by useing same name.

* age=age it will not work because preference is given to local variable it will assign value to itself.
      
      Human obj1=new Human();
      obj1.age=age; it will also not work because we are creating a new object it will not change the value of current object.

      public void setAge(int age,Human obj)
    {  Human obj1=obj;
       obj1.age=age; it will work but we are passing the object two times.It not make sense.So if we write 

    }
      public void setAge(int age)
    {   
       this.age=age; this is useful in this case.

    }

    
*/

class Humans
{   
    private int age=11; //Now  this variable age is accesible within the class only now it is private.
    private String name="Santosh";

    public int getAge()//We can accesses the age inside method of same calss.
    {
        return age;
    }

    public void setAge(int age)
    {   
       this.age=age;

    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

}


public class Thiskeyword
{
    public static void main(String args[])
    {
        Humans obj=new Humans();
        // obj.age=21;                   //we cannot set directly age because age is a private variable.
        // obj.name="Santosh";

        // System.out.println(obj.name); //it will throw error because name is private variable we cannot directly accesses.

        obj.setAge(20);               //it will set because we useing setAge method.(Accessing through method)
        obj.setName("Sam");

        System.out.println(obj.getName() + " "+ obj.getAge());
    }

}