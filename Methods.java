/* 
1)Methods with same name only difference is they have different parameters is called method Overloading
2)Every method is have its own stack.
3)There is a link between Heap and Stack.

*/
class Calculator
{
        int num=5;           //num is a instance variable(instance variable is part of the Heap)

   public int add(int n1 ,int n2,int n3) 
   {    
        int result=n1+n2+n3;   //n1,n2,n3 is a local variable(local variable is the part of the Stack)
        return result;
   }
   public int add(int n1 ,int n2) 
   {
    int result=n1+n2;
    return result;
   }
   public double add(double n1 ,int n2) 
   {
    double result=n1+n2;
    return result;
   }
}

public class Methods
{
    public static void main(String args[])
    {
        Calculator obj=new Calculator(); //obj is a reference variable not a object
        Calculator obj1=new Calculator(); 
        //int r1=obj.add(2,3,3);
        //System.out.println(r1);
        obj.num=8; //It will change for only one object because obj and obj1 are two different object

        System.out.println(obj.num);
        System.out.println(obj1.num);
        

    }

}