class Operators
{

    public static void main(String args[])
    {
      // int num=7;

      // int post=num++; //Post-Increment(Fetch first and increment later)
      //  int pre=++num; //Pre -Increment(increment first and print later)

      //  System.out.println(post);
      
      //Relational Operators
      
      int  x = 9;
      int  y = 6;


      // Boolean result=x<y;
      // Boolean result=x<=y;
      // Boolean result=x>=y;
      // Boolean result=x==y;
      // System.out.println(result);


      /*Logical Opearators(And(&),OR(|),NOt(!))
         
      (&&,||,! are called short ciruit because we are cgecking the second condition and saveing time)  

      */
        int  a = 9;
        int  b = 6;

        // Boolean result=x<y & a>b;//(it is not good for time saveing purpose)
        Boolean result=x<y && a>b;//(Sort circuit it will stop after getting 1 condiiotn true  )
        System.out.println(!result);

       
    
    } 


}