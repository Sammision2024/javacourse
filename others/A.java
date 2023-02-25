package others;

class Test
{
   public void abc()
   {
      A obj=new A();
      System.out.println(obj.marks);
   }
}




public class A
{
   protected int marks=99;     //if it will not public then it will not access from outside the package.
   // private int rollnum=82;  //It can use only in same class.
   public void show()
   {
      System.out.println("A Show");
   }

}