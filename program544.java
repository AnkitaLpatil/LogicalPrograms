
import java.util.*;

class StringDemo
{
boolean CheckVowel(String str)
{
char ch[]=str.toCharArray();

        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if((ch[icnt]=='a')||(ch[icnt]=='A')||(ch[icnt]=='e')||(ch[icnt]=='E')||(ch[icnt]=='i')||(ch[icnt]=='I')||(ch[icnt]=='o')||(ch[icnt]=='O')||(ch[icnt]=='u')||(ch[icnt]=='U'))
            {
            
                return true;
            }
          }
          return false;
}
}

class program544
{
    
public static void main(String arg[])
{
    Scanner sobj=new Scanner(System.in);

 System.out.println("Enter string");
 String str=sobj.nextLine();

StringDemo obj=new StringDemo();

boolean iret =obj.CheckVowel(str);

    if(iret==true)
    {
    System.out.println("TRUE");
    }
    else
    {
    System.out.println("FALSE");
    }
}
}