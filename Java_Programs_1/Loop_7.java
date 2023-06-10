// Problem based on loop.
// Print if a number is prime or not (Input n from the user). 

import java.util.*;

class Loop_7 {
    public static void main(String args[]) {
        System.out.println("progam to check inputed number is prime or nor? ");

        // object creation for input..
        Scanner sc = new Scanner(System.in);

        // Inputting number form user
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        // counting the factor
        int count = 0;

        // counting factor one by one
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count = count + 1;
            }
        }

        // this is conditions for prime or not prime.
        if (count == 2) {
            System.out.println(num + "This is prime numer.");
        } else {
            System.out.println(num + "This is not prime num");
        }

        sc.close();
    }
}