/*

Encapsulating the data into methods is called Encapsulation.By makeing the data private it cannot be aaccessible directly.It will accesses  only through methods.

*getting the name that method is called getter.
*setting the name that method is called setter.

*/

class Manushya
{   
    private int age=11; //Now  this variable age is accesible within the class only now it is private.
    private String name="Santosh";

    public int getAge()//We can accesses the age inside method of same calss.
    {
        return age;
    }

    public void setAge(int a)
    {
        age=a;
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }

}


public class Encapsulation
{
    public static void main(String args[])
    {
        Manushya obj=new Manushya();
        // obj.age=21;                   //we cannot set directly age because age is a private variable.
        // obj.name="Santosh";

        // System.out.println(obj.name); //it will throw error because name is private variable we cannot directly accesses.

        obj.setAge(20);               //it will set because we useing setAge method.(Accessing through method)
        obj.setName("Sam");

        System.out.println(obj.getName() + " "+ obj.getAge());
    }

}