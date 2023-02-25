/*

When object is created that object is assinged value instantly this is done by constructor.We can set the default
values.

*Constructor look like method itself.Constructor name is name as class name it is complusory.
*Constructor never return anything.
*we have to specify only the access(Public,private).
*Every time when object is created constructor call for each object.
*Calculation and assigning values always do in mrthod(Constructor will helpful).
*There are two types of Constructor 1)Parameterized 2)Default

*/

class Human
{   
    private int age; 
    private String name;

    public Human()                  //Default Constructor
    {
        System.out.println("In Constructor(Constructor set default values)");
        age=12;
        name="Santosh";
    }
    public Human(String name)                  //Default Constructor
    {
        
        this.age=12;
        this.name=name;
    }

    public Human(int age, String name)   //Parameterized  Constructor
    {
        this.age=age;
        this.name=name;
        
    }

    public int getAge()
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


public class Constructor
{
    public static void main(String args[])
    {
        Human obj=new Human();
        Human obj1=new Human(18,"Sam");
        Human obj2=new Human("Santanio"); //it will call to costructor which have one parameter.
        
        System.out.println(obj.getName() + " "+ obj.getAge());
        System.out.println(obj1.getName() + " "+ obj1.getAge());
        System.out.println(obj2.getName() + " "+ obj2.getAge());
        

        
    }

}