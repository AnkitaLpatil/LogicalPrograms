import java.util.*;

class StringDemo {
    public boolean StrCmp(String str1, String str2) {
        char[] Arr = str1.toCharArray();
        char[] Brr = str2.toCharArray();


        int iCnt = 0;

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            if (Arr[iCnt]== Brr[iCnt])
            {
                return true;
            }  
        }

        return false;
    }
}

class program562 {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your string: ");
        String str1 = sobj.nextLine();

        System.out.println("Enter your string: ");
        String str2 = sobj.nextLine();

        StringDemo obj = new StringDemo();

        boolean iret = obj.StrCmp(str1, str2);

        System.out.println("Your strings are equal: " + iret);
    }
}
