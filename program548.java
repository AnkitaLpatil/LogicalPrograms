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
         System.out.println("The array");
        int sumeven=0;
        int sumodd=0;
         for(int icnt=0;icnt<Arr.length;icnt++)
        {
            if((Arr[icnt]%5==0)&&(Arr[icnt]%2==0))
            {
                System.out.println("Even number divisible by 5:"+Arr[icnt]);
            }
            
    }
    
    }
}
class program548
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