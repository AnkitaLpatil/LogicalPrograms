import java.util.*;

class MyArray
{
    public int[] CopyArrayRev(int Arr1[],int Arr2[])
    {
        int i=0;
         for(int icnt=(Arr1.length-1);icnt>=0;icnt--)
        {     
              
            Arr2[i]=Arr1[icnt];  
              i++;
        }
            
            return Arr2;
            
    }
}

class program577
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter similar length of two arrays:");
        int Arr1l=sobj.nextInt();
        int Arr2l=sobj.nextInt();

       int Arr1[]=new int[Arr1l];
        int Arr2[]=new int[Arr2l];

        System.out.println("Enter elements for first array:"+Arr1l);        
        for(int icnt=0;icnt<Arr1.length;icnt++)
        {
            Arr1[icnt]=sobj.nextInt();
        }

        MyArray obj=new MyArray();
        int Brr[]=obj.CopyArrayRev(Arr1,Arr2);

System.out.println("contant reversed and retured");
        for(int i=0;i<Brr.length;i++)
        {
        System.out.print("\t"+Brr[i]);
        }
    }

    
}