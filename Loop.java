public class Loop
{
    public static void main(String args[])
    {
      
    //*********While Loop(Use when we dont known the iteration number)

     

     /* while(i<=4)
      {
      
      System.out.println("SAM " + i);
      i++;
       
      }
    */
      //**********Nested while Loop


    /*  while(i<=4)
      {
      
      System.out.println("Hi " + i);
     
      int j=1;
      while(j<=3)
      {
        System.out.println("Hello " + j);
        j++;
      }
       i++;
       
    } 
  */ 

  //****do while loop(Execute atleast one )

  /*
  int j=5;
   do{
   
    System.out.println("Hi " + j);
    j++;
     
   }while(j<=4);  
  */

  //***********for loop(Use when we known iteration)
  
  for(int i=1;i<=5;i++)
  {
     System.out.println("***Day" + i +"***");
    
    
    for(int j=9;j<18;j++){
      if(j<12)
      System.out.println((j) + "AM " + "  -------  " + (j+1) + "AM " );
      else
      System.out.println((j) + "PM " + "  -------  " + (j+1) + "PM ");
    }
     System.out.println();

  }
  
  }

}