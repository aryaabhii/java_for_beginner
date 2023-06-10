import java.util.Scanner;

// Make a function to check if a given number n is even or not.

public class Function_6 {
    // function for even or odd.
    public static String oddEvenCheck(int num) {
        if (num % 2 == 0) {
            return "This is even";
        } else {
            return "This is odd";
        }
    }

    // main function
    public static void main(String args[]) {
        // scanner object.
        Scanner sc = new Scanner(System.in);

        // inputting the number from user.
        System.out.print("Enter a number to check odd or even : ");
        int num = sc.nextInt();

        System.out.println(oddEvenCheck(num));

        sc.close();

    }
}
