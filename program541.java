
import java.util.*;

class StringDemo
{
public int CountCpital(String str)
{
char ch[]=str.toCharArray();
int count=0;

for(int icnt=0;icnt<ch.length;icnt++)
{
    if((ch[icnt]>='A')&&(ch[icnt]<='Z'))
    {
count++;
    }
}
return count;
}
}

class program541
{
    
public static void main(String arg[])
{
    Scanner sobj=new Scanner(System.in);

 System.out.println("Enter string");
 String str=sobj.nextLine();

StringDemo obj=new StringDemo();

int iret =obj.CountCpital(str);

System.out.println("capital letters in string are:"+iret);

}
}