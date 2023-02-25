/*

1) num = System.in.read();//It take input but gives the ASCII represenation of number.
   It reads only one character at a time.If we enter 55 it will give only 5.
2) println is method of printstream(class).

3) **********************************************BufferReader****************************************************

* BufferReader is class which works with IO.It is a specialized class for input.
* BufferReader is a resourece.So it is good idea to claose resource. 
 



*/

import java.util.*;

public class Input
{
    public static void main(String args[])
    {   int num=0;
        System.out.println("Enter the number");
        // try
        // {
        //  num = System.in.read();//it is not god.Return ASCII value.Read only one character. 
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
        // System.out.println(num-48);//ASCII of 0 is 48

    //******************************************BufferReader****************************** */
        // InputStreamReader in=new  InputStreamReader(System.in);//It also need object of InputStream.
        // BufferedReader br=new BufferedReader(in);//But it will take object of InputStreamReader class.
        // try
        // {
        //  num=Integer.parseInt(br.readLine());
        //  br.close();//closeing BufferReader.
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }
    //****************************************Scanner(Now Time for Easy)*************************** */
        
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        sc.close();
        
        System.out.println(num);
      

     }
}