import java.util.*;
public class Frequency
{
     public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       String a=new String();
       a=sc.next();
       sc.close();
       char s[]=a.toCharArray();
       int f[]=new int[a.length()];
       for(int i=0;i<a.length();i++){
        f[i]=1;
        for(int j=i+1;j<a.length();j++){
            if(s[i]==s[j]){
            f[i]++;
            s[j]='#';
         }
        }
       }
       for(int i=0;i<f.length;i++){
        if(s[i]!='#'){
            System.out.println(s[i]+":"+f[i]);
        }
       }
    }
}