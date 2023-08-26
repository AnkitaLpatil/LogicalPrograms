import java.util.*;

class Digit
{
    int Diff=0;
    int sumeven=0;
    int sumodd=0;
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
          if((Digit%2==0))
          {
            sumeven=sumeven+Digit;
          }
          else if(Digit%2!=0)
          {
            sumodd=sumodd+Digit;
          }
          
        iNo=iNo/10;
        } 
Diff=sumeven-sumodd;
    return Diff;
    }
}
class program555
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter number");
        int num= obj.nextInt();

        Digit aobj=new Digit();

       int iret= aobj.CountOdd(num);

       System.out.println("difference between sum of even digits and odd digits :"+iret);
    
    }
}