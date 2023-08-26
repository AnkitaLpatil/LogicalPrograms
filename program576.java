import java.util.*;

class MyArray
{
    public void MinArray(int Arr1[],int Arr2[])
    {
        int  min1=Arr1[0];
        int min2=Arr2[0];
        
        for(int icnt=0;icnt<Arr1.length;icnt++)
        { 
           
            if(min1>Arr1[icnt])
            {
            min1=Arr1[icnt];   
            }  
        }
        System.out.println("minimum value is 1 array:"+min1);
         for(int icnt=0;icnt<Arr2.length;icnt++)
        {
            
            if(min2>Arr2[icnt])
            {
            min2=Arr2[icnt];   
            }
        }
System.out.println("minimum value is 2 array:"+min2);
    }
}

class program576
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
        obj.MinArray(Arr1,Arr2);
        // System.out.println("difference betweem sum of two arrays is:"+iret);

    }

    
}