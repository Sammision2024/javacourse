class Student
{
    int rollno;
    int marks;
    String stuname;
}

public class Arrayobject
{
    public static void main(String args[])
    {   Student s1=new Student();
       Student s2=new Student();
       Student s3=new Student();
        s1.rollno=1;
        s1.stuname="Sam";
        s1.marks=88;

        s2.rollno=2;
        s2.stuname="Santosh";
        s2.marks=98;

        s3.rollno=3;
        s3.stuname="Santanio";
        s3.marks=67;

        // int nums[]=new int[4];
        // num[0]=4;
        // num[1]=6;
        // num[2]=8;
        // num[3]=2;

        // for(int i=0;i<nums.length;i++)
        // {
        //     System.out.println(nums[i]);
        // }

        Student students[]=new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s2;

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].stuname +" : " + students[i].marks);
        // }

        //Enhanced Loop(called in java) /For each loop

        for(Student stud : students)
        {
                System.out.println(stud.stuname +" : " + stud.marks);
        }
    }
}