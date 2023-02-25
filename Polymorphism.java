/*
Poly = Many  Morphism = Behaviour

1) Same onject have different behaviour or one thing useing for many purposes.
2) There are two types of polymorphism 

                               Polymorphism
                                    |
                                    |
            __________________________________________________________
            |                                                         |
    Compile Time Polymorphism                               Run Time Polymorphism
    --------------------------                              ----------------------
    > If the Behaviour is defined                      >If the Behaviour is defined
      at compile time then it is                        at run time then it is run
      compile time polymorphism.                        time polymorphism.
      Example:- Overloading.                             Example:- Overriding(We dont know which method should call
                                                                   it will decide at runtime)


*/

//Implementaion of Run Time Polymorphism by useing Dynamic Method Dispatch.(It will work only we have inheritance)

class Sun 
{
    public void show()
    {
        System.out.println("In Sun Show");
    }
}
class Moon extends Sun 
{
    public void show()
    {
        System.out.println("In Moon Show");
    }
}
class Earth extends Sun
{
    public void show()
    {
        System.out.println("In Earth Show");
    }
}

public class Polymorphism
{

    public static void main(String args[])
    {  
        //This method is called Dynamic method dispatch.

        Sun obj=new Sun(); //Reference of parent class A but objct will create of Child class B.
        obj.show();    //It will call class A method.
        
        obj=new Moon();   //We can assign a new object to old variable.
        obj.show();    //It will call class B method.Becuase object of B.

        obj=new Earth();
        obj.show();   //So obj.show() same object have different behaviour run time polymorphism.While compilation we cannot decide wich method will call.It decide in run time.

    }
}