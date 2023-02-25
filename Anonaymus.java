class Z
{
    public Z()
    {
        System.out.println("Object Created");
    }

    public void show()
    {
        System.out.println("In a show");
    }

}

public class Anonaymus
{
    public static void main(String args[])
    {
        new Z().show();//Anonaymus object.Not takeing any reference object.

    }

}