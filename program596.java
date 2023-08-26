import java.util.*;
class New {
    public void pattern(int number) {
        int temp = number;
        int divisor = 1;
        
        while (temp > 0) {
            divisor =divisor* 10;
            temp =temp/ 10;
        }
        
        divisor =divisor/ 10;
        temp = number;
    
        while (divisor > 0) {
            int digit = temp / divisor;
            temp %= divisor;
            divisor /= 10;
            System.out.print(digit+"\t");
            
            for (int i = 1; i<= digit; i++) {
                System.out.print("#\t");
            }
            
            System.out.println();
        }
    }
}


class program596
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int number = 0;

        System.out.println("Enter number");
        number = sobj.nextInt();

        
        New mobj = new New();  
        mobj.pattern(number);
           }
}
