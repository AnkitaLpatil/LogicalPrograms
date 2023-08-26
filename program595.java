import java.util.*;
class New {
    public void pattern(int number) {
        int temp = number;
        int divisor = 1;
        
        while (temp > 0) {
            divisor *= 10;
            temp =temp/ 10;
        }
        
        divisor =divisor/ 10;
        temp = number;
        
        while (divisor > 0) {
            int digit = temp / divisor;
            temp %= divisor;
            divisor /= 10;
            
            for (int i = digit; i> 0; i--) {
                System.out.print(i+"\t");
            }
            
            System.out.println();
        }
    }
}


class program595
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
