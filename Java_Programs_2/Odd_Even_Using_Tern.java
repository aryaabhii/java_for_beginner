
// Program for odd & even number.
import java.util.Scanner;

class Odd_Even_Using_Tern {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num1;
        System.out.println("Enter a number to check weather odd or even : ");
        num1 = s.nextInt();
        System.out.println((num1 % 2 == 0) ? num1 + " is even number." : num1 + " is odd number.");
        s.close();
    }
}