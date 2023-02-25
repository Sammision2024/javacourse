
public class Threedarray
{
    public static void main(String args[])
    {
        int nums[][][]=new int [3][4][3]; //3D array
       

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)

            {  for(int k=0;k<3;k++)
                { 
                nums[i][j][k]=(int)(Math.random()*10);//Math.random() generates random value.
                System.out.println(nums[i][j][k]);
                }
            }
        }

      
        
        //*****Enhanced For Loop(NO need to mention size of loop*****.
        for(int n[][]:nums)     //n is not a simple variable it is a single dimensionla array.
        {
            for(int m[]:n)
            {   for(int l:m)
                {
                    System.out.print(l +" ");
                }
                System.out.println();

             
            }
            System.out.println();
           
        }

        System.out.println(nums[2][1][2]);

       

    }
}