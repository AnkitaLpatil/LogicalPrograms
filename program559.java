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

 public void Display(int istart,int iend)
 {
    int iCnt=0;
     for( iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((istart<Arr[iCnt])&&( Arr[iCnt]<iend))
            {
                System.out.println("between that range elements are:"+Arr[iCnt]);
            }
           
        } 
              
 }
}
class program559
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        
        System.out.println("Enter number of elements : ");
        int isize = sobj.nextInt();

        System.out.println("Enter Lower range: ");
        int iNO1 = sobj.nextInt();

        System.out.println("Enter upper range : ");
        int iNO2 = sobj.nextInt();


        Number aobj = new Number();
        aobj.Accept(isize);
        aobj.Display(iNO1,iNO2);
                 
    }


}