import java.util.*;

class ArrayDemo
{
    public int Arr[];
    public ArrayDemo(int isize)
    {
     Arr =new int[isize];
    }
    public void Display()
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter elements: ");
        for(int icnt=0;icnt<Arr.length;icnt++)
        {
            Arr[icnt]=sobj.nextInt();
        }
        //  System.out.println("The array");
        int sumeven=0;
        int sumodd=0;
         for(int icnt=0;icnt<Arr.length;icnt++)
        {
            if(Arr[icnt]%5==0)
            {
                System.out.println("number divisible by 5:"+Arr[icnt]);
            }
            else
            {
                System.out.println("no nunber present divisible by 5");
            }
    }
    
    }
}
class program547
{
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter numbers");
        int isize= obj.nextInt();

        ArrayDemo aobj=new ArrayDemo(isize);

        aobj.Display();
    
    }
}