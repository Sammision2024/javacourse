enum Laptop
{
    Macbook(2000),Xps(2200),Surface,Thinkpad(1200);
    private int price;

    private Laptop()//useing private constructor because createing object in same class itself.
    {
        price=500;
    }

    private Laptop(int price)
    {
        this.price=price;
        System.out.println("in Laptop " + this.name());
    }

    public void setPrice(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;

    }
}

public class Enumclass
{
    public static void main(String args[])
    {
        // Laptop lap=Laptop.Macbook;
        // System.out.println(lap +":"+lap.getPrice());

        for(Laptop lap:Laptop.values())
        {
            System.out.println(lap +":"+ lap.getPrice());
        }
    }
}

