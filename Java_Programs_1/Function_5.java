// Make a function to check if a number is prime or not.

import java.util.Scanner;

public class Function_5 {
    // fucntion for pime number
    public static String primeCheck(int num) {
        int factorCount = 0;
        for (int i = 1; i <= num; i++) {
            // checking factor of number.
            if (num % i == 0) {
                factorCount = factorCount + 1;
            }
        }
        // checking condition and printing.
        if (factorCount == 2) {
            return "This is prime number..";
        } else {
            return "This is not prime number..";
        }
    }

    // main function.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Inputting number.
        System.out.print("Enter nth number : ");
        int num = sc.nextInt();

        // calling function.
        System.out.println(primeCheck(num));

        sc.close();
    }
}
