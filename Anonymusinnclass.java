/*

1) Anonymus Inner class = Something Doesn't have a name is called Anonymus class.
2) For overiding the method we are creating the new class if we want overide only once it is not good to makw a new
   class.We can override method while creating object.

   A.bbj=new A()
   {  
    public void show()
    {
        //This is a inner class and it has not name so it is called inner class.
    }
   
   }:
3)  Anonymus Inner class also can used for abstract class. 

*/

class N
{
    public void show()
    {
        System.out.println("In A Show");
    }
}


public class Anonymusinnclass
{
    public static void main(String args[])
    {
        N obj=new N()
        {
            public void show()
            {
                
            System.out.println("In new Show");   //Inner class(Class in Anonymusinnclass) without name .
            
            }       
        
        };

        obj.show();//Method will overide by useing inner class(Anonymus inner class).

    }
}