import java.util.*;

class Pattern {
    public void pattern(String str) {
        int length = str.length();

        for (int i = length; i >= 0; i--) {
            for (int j = 0; j < length; j++) {
                if (((i==j))) {
                    System.out.print(str.charAt(j) + "\t");
                }
                 else if((j<=i)) {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}

class program569
 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sobj.nextLine();

        Pattern obj = new Pattern();
        obj.pattern(input);
    }
}