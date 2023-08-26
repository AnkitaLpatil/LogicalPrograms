import java.util.*;

class Digit
{
    int count=0;
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
          if((Digit>3)&&(Digit<7))
          {
            count++;
          }
        iNo=iNo/10;
        }   
    return count;
    }
}
class program553
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter number");
        int num= obj.nextInt();

        Digit aobj=new Digit();

       int iret= aobj.CountOdd(num);

       System.out.println("count of  digits between 3 and 7:"+iret);
    
    }
}