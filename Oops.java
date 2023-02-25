class Computer
{
    public void playMusic()
    {
       System.out.println("Playing Music");   //Behaviour of Method
    }

    public String getMeAPen(int cost)
    {   if(cost>=10)
        {
            return "Pen";
        }
        else
        {
           return "Nothing";
        }
    }
}


public class Oops
{
    public static void main(String args[])
    {
      Computer obj=new Computer();
      obj.playMusic();

      String str=obj.getMeAPen(9);
      System.out.println(str);
    }
} 




/*

Object Oriented Programming

Object - object have Properties Methods and Behaviour.
JVM - Create Object in java.
class - class is a blueprint of an idea.


*/ 