import java.util.*;

class Matrix
{
    public int Arr[][];

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

    public void AddDiagonal()
    {
        
        System.out.println("Addition of row elements of matrix are : ");
        for(int j = 0; j < Arr.length; j++)
        {
            int sumDia=0;
            for(int i = 0; i < Arr[j].length; i++)
            {
                    sumDia=sumDia+Arr[i][j];
                
            }
            System.out.println(sumDia);
        } 
        
    }
}

class program589
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
        mobj.AddDiagonal();
        System.out.println();
    }
}
