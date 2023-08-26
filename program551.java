import java.util.*;

class Digit
{
    int count=0;
    public int CountEven(int iNo)
    {
        if(iNo<0)
        {
            iNo=-iNo;
        }
        while(iNo>0)
        {
            int temp=iNo;
          int Digit=iNo%10;
          if(Digit%2==0)
          {
            count++;
          }
        iNo=iNo/10;
        }   
    return count;
    }
}
class program551
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter number");
        int num= obj.nextInt();

        Digit aobj=new Digit();

       int iret= aobj.CountEven(num);

       System.out.println("count of even digits:"+iret);
    
    }
}