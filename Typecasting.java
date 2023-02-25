/* 

byte b= 127
int a = 257
 b=a (It will not work)
 a=b (it will work but a should be in byte range if it is not in range then it will use modulo(%) and divide 
 by byte range(-128 to 127) which 256 in total.... 257%256)

for b=a (we have to typecast)
> b=(byte)a; 

b=(byte)a (It is a explicitly conversion is  called Typecasting)
a=b (it is a implicit conversion called Typeconversion)

*********************************************TYPE PROMOTION*****************************************************
byte x=10;
byte y=30;
int result = x*y (it will go out of range according to byte so java will promopt it is called Typepromotion)


*/


class Typecasting
{
        public static void main(String a[])
    {
        byte b= 127;
        int c = 257;
        b=(byte)c; //257%256

        System.out.println(b);

        float f=5.6f;
        int num=(int)f;
        System.out.println(num);

    //*****Type Promotion**** */
        byte x=10;
        byte y=30;
        int result = x*y;
        System.out.println(result);
        


    }
}