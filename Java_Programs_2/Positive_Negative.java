
// Program to check number is positive or negative integer using ternaryu operator.
import java.util.Scanner;

class Positive_Negative {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to check Positive or negative : ");
        int num = s.nextInt();
        /**
         * Here, num is an integer variable. condition is check for negative of positive
         * integer.
         * Checking condition using ternary opeartor num is less than zero or equal to then
         * print neagtive else positibe.
         */
        System.out.println((num <= 0) ? num + " is Negative" : num + " is Positive");
        s.close();
    }
}
