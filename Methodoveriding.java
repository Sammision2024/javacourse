/*
  Methodoveriding :-Means overiding(makeing changes in method of parent class).
* Methodoveriding gives preference to a same class.
 */

class Q 
{
  public void show()
  {
    System.out.println("In A Show");
  }
  public void config()
  {
    System.out.println("In a Config");
  }
}

class R extends Q
{
    public void show()
    {
        System.out.println("In B Show");
    }
}

public class Methodoveriding
{
    public static void main(String args[])
    {
        R obj=new R();
        obj.show();
        obj.config();
    }
}
