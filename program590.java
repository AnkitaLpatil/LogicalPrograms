import java.util.*;

class Matrix
{
    public int Arr[][];
    public int trancepose[][];

    public Matrix(int i, int j)
    {
        Arr = new int[i][j];
        trancepose=new int[i][j];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements : ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Elements of matrix are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print("\t"+Arr[i][j]);
                trancepose[j][i]=Arr[i][j];
            }
            System.out.println();
        } 
         System.out.println("Tansepose  of matrix is : ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            {
                System.out.print("\t"+trancepose[i][j]);
            }
            System.out.println();
        } 
   
    }
}

class program590
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0, iCol =0;

        System.out.println("Enter number of rows");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns");
        iCol = sobj.nextInt();
        
        Matrix mobj = new Matrix(iRow,iCol);  
        mobj.Accept();
        mobj.Display();
    }
}
