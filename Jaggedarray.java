/*  Jagged Array(Columns are not Specified )
*/

public class Jaggedarray
{
    public static void main(String args[])
    {
        int nums[][]=new int [3][];//Jagged array coloumns are not specified we have to specify individually.
        nums[0]=new int[4];         //row one have 4 coloumns/element.
        nums[1]=new int[4];         //row two have 4 coloumns/element.
        nums[2]=new int[4];         //row three have 4 coloumns/element.

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[1].length;j++)
            {
                nums[i][j]=(int)(Math.random()*10);//Math.random() generates random value.
                System.out.println(nums[i][j]);
            }
        }

      
        
        //*****Enhanced For Loop(NO need to mention size of loop*****.
        for(int n[]:nums)     //n is not a simple variable it is a single dimensionla array.
        {
            for(int m:n)
            {
                System.out.print(m +" ");

            }
            System.out.println();
        }

       

    }
}