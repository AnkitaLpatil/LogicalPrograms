
import java.util.*;

class StringDemo
{
public int Countsmall(String str)
{
char ch[]=str.toCharArray();
int count=0;

for(int icnt=0;icnt<ch.length;icnt++)
{
    if((ch[icnt]>='a')&&(ch[icnt]<='z'))
    {
count++;
    }
}
return count;
}
}

class program542
{
    
public static void main(String arg[])
{
    Scanner sobj=new Scanner(System.in);

 System.out.println("Enter string");
 String str=sobj.nextLine();

StringDemo obj=new StringDemo();

int iret =obj.Countsmall(str);

System.out.println("Small letters in string are:"+iret);

}
}