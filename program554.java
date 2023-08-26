import java.util.*;

class Digit
{
    int multi=1;
    public int CountOdd(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
            int temp=iNo;
          int Digit=iNo%10;
          if(Digit==0)
          {
         Digit=1;
          }
              multi=multi*Digit;
        iNo=iNo/10;
        }   
    return multi;
    }
}
class program554
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter number");
        int num= obj.nextInt();

        Digit aobj=new Digit();

       int iret= aobj.CountOdd(num);

       System.out.println("multiplication of digits:"+iret);
    
    }
}