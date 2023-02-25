public class Stringbuff
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Santosh");
        System.out.println(sb.capacity()); //StringBuffer gives size of 16 bytes.if we store a data then it will again StringBuffer give extra 16 bytes.
        System.out.println(sb.length()); 
        System.out.println(sb.append(" Hello")); //append data.
        // System.out.println(sb.deleteCharAt(2)); //deleete char at index 2.
        System.out.println(sb.insert(7, " Java")); //add java at index 7(index start from 1).
        
    }
}