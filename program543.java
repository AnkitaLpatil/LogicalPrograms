
import java.util.*;

class StringDemo
{
public int CountDiff(String str)
{
char ch[]=str.toCharArray();
int countA=0;
int counta=0;
for(int icnt=0;icnt<ch.length;icnt++)
{
    if((ch[icnt]>='A')&&(ch[icnt]<='Z'))
    {
countA++;
    }
    else if((ch[icnt]>='a')&&(ch[icnt]<='z'))
    {
counta++;
    }
}
int Diff=counta-countA;
return Diff;
}
}

class program543
{
    
public static void main(String arg[])
{
    Scanner sobj=new Scanner(System.in);

 System.out.println("Enter string");
 String str=sobj.nextLine();

StringDemo obj=new StringDemo();

int iret =obj.CountDiff(str);

System.out.println("Difference in small and capital letters in string are:"+iret);

}
}