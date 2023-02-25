/* ***************Object class********************.

1) Every we try to print the object it will called tostring() method by default.
2) tostring() method is a objectclass method even if we dont write in class then also it is called by object.
2) tostring() method returns the class name."@".integer.toHexString(hashCode());
3) Hashcode tryies to convert all data in one string.(if we have five variable it will apply hash algorithm and    generate a string)

4) If we not mention a method in class and try to call class by object it will called to super class (object class) tostring() method.

5) (To two compare integer use ==).

6) By default object class is a super class of every class.

6) For chaecking two objects it should have equal value and also a same hashcode so dont impleemtn equals method by self use IDE suggestions.


*/

class Laptops
{
    public int price;
    public String model;

    public String tostring()
    {
        return "Hey";
    }
    public boolean equals(Laptops that)
    {
        if(this.model.equals(that.model) && this.price==(that.price))//comapreing two objects.
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
public class Objectclass
{
    public static void main(String args[])
    {
        Laptops obj1=new Laptops();
        obj1.model="Lenovo";
        obj1.price=1000;

        Laptops obj2=new Laptops();
        obj2.model="Lenovo";
        obj2.price=1000;
        
        boolean result=obj1.equals(obj2); // it will give false because we dont have a equal class it will called the object class(Super class of Laptop equal method will call from there).Lets make equal method in class Laptop.After that it will print true.

        // System.out.println(obj); //it wil print Laptop@2c7b84de(where laptop is a class and obj is object of class)
        
        
        System.out.println(result); 
        System.out.println(obj1.tostring());





    }
}