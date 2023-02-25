/*

FunctionalInterface : The interface have only one method is called functionalinterface.

1) @FunctionalInterface Annotation is used for Functionalinterface.

*/



@FunctionalInterface
interface Oneman 
{
     void show();
    //  void run();//It will give erroe because interface A is functionalinterface(Can only have one method).
     
    
}
// class B implements A 
// {
//     public void show()
//     {
//         System.out.println("In Show");
//     }
// }

public class Funcinterface
{
    public static void main(String args[])
    {
      Oneman obj=new Oneman() //Instantenous A by its own implementation. 
      {
        public void show()
        {
            System.out.println("In Own Show");
        }
      };
      obj.show();  
    }
}