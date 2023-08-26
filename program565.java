import java.util.*;

class MyArray {
    public void ArrayReplace(char Arr1[]) 
    {
        for (int icnt = 0; icnt < Arr1.length; icnt++) 
        {
            if ((Arr1[icnt] >= 'A') && (Arr1[icnt] <= 'Z')) 
            {
                Arr1[icnt] = (char) (Arr1[icnt] + 32);
            }
            System.out.print("\t"+(char)Arr1[icnt]);
        }
        System.out.println();
    }
}

class program565 {
    public static void main(String arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter length of the array:");
        int Arr1l = sobj.nextInt();

        char Arr1[] = new char[Arr1l];

        System.out.println("Enter the characters in capital:");
        for (int icnt = 0; icnt < Arr1.length; icnt++) {
            Arr1[icnt] = sobj.next().charAt(0);
        }

        MyArray obj = new MyArray();
        obj.ArrayReplace(Arr1);
    }
}
