/*

**********************Inheritance**************************
1)Inheritance means copying the features from upper classs(parent class(Base class,Super class) to child class(Derived class,Subclass))

Example :- Laptop is a computer.Laptop got a features from computer(Inheritance).
           Before there is normal calculators which do simple calculatons(+,-,/,*).Now there are advance calculators which inherit the features from normal calculators. 

*  We have two class files Calculator(Parent class) and Advancecal(Child class).Child is takeing features from      parent class.Remember in java class should be present.Java file not necessary.

 //******************Multilevel inheritance**********************
 
 public class Calculator
 {

 }
 public Advancecal extends Calculator
 {

 }
 public Scientificcal extends Advancecal
 {

 }

 
 
 */

 

 

public class Inheritance
{
    public static void main(String args[])
    {
        Scientificcal calc=new Scientificcal();//Multilevel Inheritance
        // Advancecal calc=new Advancecal();//Single Inherittance Inheritance
        int r1=calc.add(3,4);
        int r2=calc.sub(9,4);
        int r3=calc.mul(10,4);
        int r4=calc.div(10,2);
        double r5=calc.power(4,2);

          System.out.println("Addition "+ r1 + ":"+" Subtraction " + r2 + ":" + " Multiplication " + r3 + ":" + "  Division " + r4 + ":" + "Power" + r5  );
    }
}