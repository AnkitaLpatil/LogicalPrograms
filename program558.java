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

 int LastOCC(int NO)
 {
    int iCnt=0;
     for( iCnt = Arr.length-1; iCnt>=0 ;iCnt--)
        {
            System.out.println(iCnt);
            if(Arr[iCnt]==NO)
            {
                return iCnt;
            }
           
        } 
        return (-1);       
 }
}
class program558
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
        int iret=aobj.LastOCC(iNO);
         
        
        System.out.println("index of last occurance"+iret);
         
    }


}