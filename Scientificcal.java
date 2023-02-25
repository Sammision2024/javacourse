import others.tools.Advancecal;

public class Scientificcal extends Advancecal
{
    public double power(int n1,int n2)
    {
        return Math.pow(n1,n2);
    }

    public int sub(int i, int j) {
        return i-j;
    }

    public int add(int i, int j) {
        return i+j;
    }

    public int div(int i, int j) {
        return i/j;
    }

    public int mul(int i, int j) {
        return i*j;
    }
}