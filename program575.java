import java.util.*;

class MyArray
{
    public int DiffArray(int Arr1[],int Arr2[])
    {
        int sum1=0,sum2=0;
        for(int icnt=0;icnt<Arr1.length;icnt++)
        {
            sum1=sum1+Arr1[icnt];     
        }
        
         for(int icnt=0;icnt<Arr2.length;icnt++)
        {
            sum2=sum2+Arr2[icnt];  
        }

        int diff=sum1-sum2;
        return diff;
    }
}

class program575
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
       int iret= obj.DiffArray(Arr1,Arr2);
        System.out.println("difference betweem sum of two arrays is:"+iret);

    }

    
}