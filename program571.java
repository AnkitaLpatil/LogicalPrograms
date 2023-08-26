import java.util.*;

class MyArray
{
    public void DisplayEven(int Arr1[],int Arr2[])
    {
        System.out.print("first array :");

        for(int icnt=0;icnt<Arr1.length;icnt++)
        {
            if(Arr1[icnt]%2==0)
            {  
            System.out.print("\t"+Arr1[icnt]);
            }
        }
        System.out.println();
        System.out.print(" second array :");
         for(int icnt=0;icnt<Arr2.length;icnt++)
        {
            if(Arr2[icnt]%2==0)
            {
            System.out.print("\t"+Arr2[icnt]);
            }
        }
    }
}

class program571
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter length of two arrays:");
        int Arr1l=sobj.nextInt();
        int Arr2l=sobj.nextInt();

       int Arr1[]=new int[Arr1l];
        int Arr2[]=new int[Arr2l];

        System.out.println("Enter elements for first array:"+Arr1l);        
        for(int icnt=0;icnt<Arr1.length;icnt++)
        {
            Arr1[icnt]=sobj.nextInt();
        }

        System.out.println("Enter elements for second array:"+Arr2l);        
        for(int icnt=0;icnt<Arr2.length;icnt++)
        {
            Arr2[icnt]=sobj.nextInt();
        }

        MyArray obj=new MyArray();
        obj.DisplayEven(Arr1,Arr2);
    }

    
}