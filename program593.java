import java.util.Scanner;

class New {
    public void pattern(int number) {
        
        int temp = number;
        int Arr[]=new int[0];
        
        while (temp > 0) {
            int digit = temp % 10;
            for (int i = 0; i < digit; i++) {
                System.out.print("*\t");
            }
            System.out.println();
            temp = temp / 10;
        }
    }
}

class program593
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        New newObj = new New();
        newObj.pattern(number);
    }
}
