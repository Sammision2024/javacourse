/*

static variable is shared by different objects and it is call by its class name.

* if we call the non satatic method we have to create the object for it .
* Non static method cannot call by class name.
* We cannot use non static variable inside static method.We should have object reference to use. 
* We can use  static variable only  inside static method.
* static block will called only once.
* static block will call first.
* class will load first and then it will call first to static and then after it will call constructor.


*/

class Dabha
{
        String brand;
        int price;
    // String name;//it is insatnce variable we need to change different for different object.
    static String name; //static make variable common to all objects and name is now a class memeber not a object memeber.

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public Dabha()//constructor called for every new object;
    {
        brand="NUll";
        price=200;
        System.out.println("In a constructor");
        
    }
    static//name will intialize only once static block will called only once.
    {
        name="Phone";
        System.out.println("In static block");
    }

}
  
    

public class Staticblock
 
{
    public static void main(String args[])//if we remove static from here then we have to make a object for running the Class but main as we known it exceuteion starts from main how can we make object.There wil deadlock now so for this we use static keyword (static void main). Now main is a static method.We can call from name of class.
    
    {
      Dabha obj1 = new Dabha();
      obj1.brand="Apple";
      obj1.price=1500;
      Dabha.name="Smartphone";

    //   Mobile obj2=new Mobile();
    //   Mobile obj3=new Mobile();

    }
}