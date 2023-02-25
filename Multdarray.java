/*  Multidimensional Array(Array of arrays)
1)Syntax :- array datatype arrayname[][]=new  array datatype[Size].
2)i represent the rows and j represent the coloumn


*/
public class Multdarray
{
    public static void main(String args[])
    {
        int nums[][]=new int [3][4];//nums have 3 internals arrays and each array have four elements.
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j]=(int)(Math.random()*10);//Math.random() generates random value.
                System.out.println(nums[i][j]);
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
           System.out.println(); 
        }
        
        //*****Enhanced For Loop*****.
        for(int n[]:nums)//n is not a simple variable it is a single dimensionla array.
        {
            for(int m:n)
            {
                System.out.print(m +" ");

            }
            System.out.println();
        }

       

    }
}