/* ***************Enums****************************

1) enumeration(enum for short)
2) Enums are name constants.
3) Enums are inbuilt.
4) When we have to return status to a client it is useful.
5) enum cannot extends by other class.
6) Every class in java default ectends object class(super class).Same enum extends default  enum class.

*/

enum Status
{   
    Running,Failed,Pending,Sucess; //all are objects of status.

}

public class Enums
{
    public static void main(String args[])
    {   
        // int i=5;

        Status stat = Status.Running; // it will assign to object s.
        // System.out.println(s.ordinal());
        // System.out.println(s);

        System.out.println(stat.getClass().getSuperclass());

        
        // Status[] ss=Status.values();

        // for(Status s : ss)
        // {
        //     System.out.println(s + " : " + s.ordinal());
        // }
        switch(stat)//enum by switch.
        {
            case Running:
                System.out.println("All Good"); 
                break;
            case Failed:
                System.out.println("Try Again");  
                break;
            case Pending:
                System.out.println("Please Wait");  
                break;
            
            default:
                System.out.println("Done");
        }
//**********************************************************************************
        if(stat==Status.Running)//enum by switch.
        {
            System.out.println("All Good");
        }

        else if(stat==Status.Failed)
        {
            System.out.println("Try Again");
        }

        else if(stat==Status.Pending)
        {
            System.out.println("Please wait");
        }
        else
        {
            System.out.println("Done");
        }

    }
}