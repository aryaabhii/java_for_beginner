
// Program to print the smallest number among three numbers using Else if
// ladder.
import java.util.Scanner;

class Smallest_Number {
    public static void main(String args[]) {
        int num1, num2, num3;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1 = s.nextInt();
        System.out.println("Enter second number : ");
        num2 = s.nextInt();
        System.out.println("Enter third number : ");
        num3 = s.nextInt();
        if (num1 < num2) // checking conditons between 1, 2, & 3
            if (num1 < num3) {
                System.out.println(num1 + " is smallest number.");
            } else {
                System.out.println(num3 + " is smallest number.");
            }
        else if (num2 < num3) {
            System.out.println(num2 + " is smallest number.");
        } else {
            System.out.println(num3 + " is smallest number.");
        }
        s.close();
    }
}
