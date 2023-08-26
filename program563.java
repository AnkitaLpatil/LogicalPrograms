
import java.util.*;

class StringDemo
{
public String Reverse(String str)
{

char Ch[]=str.toCharArray();
int istart=0;
int iend=Ch.length-1;
 char temp=' ';
int iCnt=0;

        while(istart<iend)
        {
           temp=Ch[istart];
           Ch[istart]=Ch[iend];
           Ch[iend]=temp;

           istart++;
           iend--;

        }
  return new String (Ch);
}
}

class program563
{
    
public static void main(String arg[])
{
    Scanner sobj=new Scanner(System.in);

 System.out.println("Enter string");
 String str=sobj.nextLine();

StringDemo obj=new StringDemo();

String sret =obj.Reverse(str);

    System.out.println("reverse of string::"+sret);
    
}
}
