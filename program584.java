import java.util.*;

class MyArray
{
    public void Percentage(float Arr1[])
    {
        
         for(int icnt=0;icnt<Arr1.length;icnt++)
        {     
              
            if(Arr1[icnt]<30)
            {
                System.out.println(Arr1[icnt]+"fail");

            }  
           else if(Arr1[icnt]>31)
            {
                System.out.println(Arr1[icnt]+"Pass");

            }
        }      
    }
}

class program584
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Enter length of arrays:");
        int Arr1l=sobj.nextInt();
        

       float Arr1[]=new float[Arr1l];
        

        System.out.println("Enter elements for array:"+Arr1l);        
        for(int icnt=0;icnt<Arr1.length;icnt++)
        {
            Arr1[icnt]=sobj.nextFloat();
        }

        MyArray obj=new MyArray();
        obj.Percentage(Arr1);


    }

    
}