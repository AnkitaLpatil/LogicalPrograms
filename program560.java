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

 public int Displayodd()
 {
    int iCnt=0,product=1;
     for( iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt]%2)!=0)
            {
                // product=1;
                product=product*Arr[iCnt];
            }
           
        } 
        return product;      
 }
}
class program560
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        
        System.out.println("Enter number of elements : ");
        int isize = sobj.nextInt();

        Number aobj = new Number();
        aobj.Accept(isize);
       int iret= aobj.Displayodd();

        System.out.println("product of odd elements is:"+iret);

    }


}