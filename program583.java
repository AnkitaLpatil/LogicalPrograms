import java.util.*;

class Pattern{
    public void pattern(int iRow,int iCol) 
    {
     int i = 0, j = 0;

    if(iRow != iCol)
    {
        System.out.println("Invalid input\n");
        return;
    }
 
    
    for(i = 1; i<=iRow; i++)   
    {  
        for(j = 1; j <= iCol; j++)  
        { 
             if((i==1) || (i == iRow) || (j == 1) || (j == iCol) || (i == j))
            {
                System.out.print(j+"\t");
            }
            else
            {
                System.out.print(" \t");
            }
        }
        System.out.println("\n");
    }
}
}

class program583
 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter row and column");
        int i = sobj.nextInt();
        int j = sobj.nextInt();

        
        Pattern obj = new Pattern();
        obj.pattern(i,j);
    }
}
