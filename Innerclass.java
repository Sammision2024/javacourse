/* **********************Innerclass(Class Inside Class)***********************

1) A.B obj1=obj.new B(); B belongs to class A(A.B) obj1 = declare first object of A.
   Then new object of B(obj.new B())
2) We cannot make outer class Static.
3) We can make inner class Static only. 


*/

class G
{   
    int age;

    public void show()
    {
        System.out.println("In Show");
    }
    class H
    {   
         public void config()
        {
            System.out.println("In Config");
        }

    }
}

public class Innerclass
{
    public static void main(String args[])
    {
        G obj=new G();
        obj.show();

        G.H obj1=obj.new H(); //If we want to call config() we need object of A.  B belongs to Class A,
        
        // A.B obj1=new A.B();//if class B it will work.
        
        obj1.config();
      
    
    }
}