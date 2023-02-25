/*
static variable is shared by different objects and it is call by its class name. 

*/
class Mobile
{
    String brand;
    int price;
    // String name;
    static String name; //static make variable common to all objects and name is now a class memeber not a object memeber.

    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}




public class Satickey
{
    public static void main(String args[])
    {
      Mobile obj1 = new Mobile();
      obj1.brand="Apple";
      obj1.price=1500;
      Mobile.name="Smartphone";

      Mobile obj2 = new Mobile();
      obj2.brand="Redmi";
      obj2.price=500;
      Mobile.name="Smartphone";

      Mobile obj3 = new Mobile();
      obj3.brand="Samsung";
      obj3.price=1000;
      Mobile.name="Smartphone";

      Mobile.name="Phone";//it will change all objects because name is static.

      obj1.show();
      obj2.show();
      obj3.show();


    }
}