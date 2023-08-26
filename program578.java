import java.util.*;

class MyArray
{
    public void Arraycontent(int Arr1[],int Arr2[],int size1,int size2)
    {
        int isize=size1+size2;
        int New[]=new int [isize];

        for(int icnt=0;icnt<Arr1.length;icnt++)
        {
            {
            New[icnt] =Arr1[icnt];  
            }   
        }
        
            int x=size1;
            while(x<isize)
            { 
         for(int icnt=0;icnt<Arr2.length;icnt++)
        {       
            New[x]=Arr2[icnt];  
            x++;
              
        }
            }
        for(int i=0;i<New.length;i++)
        {
        System.out.print("\t"+New[i]);
        }
    }
}

class program578
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
        obj.Arraycontent(Arr1,Arr2,Arr1l,Arr2l);
    }

    
}