import java.util.*;

class Number
{
    public int Arr[];

    public void Accept(int isize)
    {
        Arr=new int[isize];

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");
        for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

 boolean check(int NO)
 {
     for(int iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if(Arr[iCnt]==NO)
            {
                return true;
            }
           
        } 
        return false;       
 }
}
class program556
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        
        System.out.println("Enter number of elements : ");
        int isize = sobj.nextInt();

        System.out.println("Enter number that want to find : ");
        int iNO = sobj.nextInt();


        Number aobj = new Number();
        aobj.Accept(isize);
        boolean iret=aobj.check(iNO);
         
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