/*

static variable is shared by different objects and it is call by its class name.

* if we call the non satatic method we have to create the object for it .
* Non static method cannot call by class name.
* We cannot use non static variable inside static method.We should have object reference to use. 
* We can use  static variable only  inside static method.

*/

class Mobiles
{
        String brand;
        int price;
    // String name;
    static String name; //static make variable common to all objects and name is now a class memeber not a object memeber.

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobiles obj)//takeing reference of object.By createing obj object of Mobile.
    {
         System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
    // public static void show2()
    // {
    //      System.out.println(brand + " : " + price + " : " + name);
    // }
}
    





public class Staticmethod
{
    public static void main(String args[])//if we remove static from here then we have to make a object for running the Class but main as we known it exceuteion starts from main how can we make object.There wil deadlock now so for this we use static keyword (static void main). Now main is a static method.We can call from name of class.
    
    {
      Mobiles obj1 = new Mobiles();
      obj1.brand="Apple";
      obj1.price=1500;
      Mobiles.name="Smartphone";

      Mobiles obj2 = new Mobiles();
      obj2.brand="Redmi";
      obj2.price=500;
      Mobiles.name="Smartphone";

      Mobiles obj3 = new Mobiles();
      obj3.brand="Samsung";
      obj3.price=1000;
      Mobiles.name="Smartphone";

      Mobiles.name="Phone";//it will change all objects because name is static.

    //   obj1.show();
    //   obj2.show();
    //   obj3.show();

     Mobiles.show1(obj1);


    }
}