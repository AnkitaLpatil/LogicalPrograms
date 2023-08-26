import java.util.*;

class Matrix
{
    public int Arr[][];
    public int trancepose[][];

    public Matrix(int i, int j)
    {
        Arr = new int[i][j];
        
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
        int x=Arr.length;
        int start=0;
        int end=x-1;
        int temp=0;
        System.out.println("Elements of matrix are : ");
        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = 0; j < Arr[i].length; j++)
            { 
                while(start<end)
                {
                temp=Arr[i][start];
                Arr[i][start]=Arr[i][end];
                Arr[i][end]=temp;
                start++;
                end--;
                }
                  System.out.print("\t"+Arr[i][j]);

            }
            System.out.println();
        } 
   
    }
}

class program591
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
