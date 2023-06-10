import java.util.Scanner;

// Write a function to print the sum of all odd numbers form 1 to n.

class PracticeQuestion_2 {
    // odd number finding function.
    public static void oddNumber(int num) {
        for (int i = 1; i <= num; i++) {
            // condition to check number is odd or not
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // main function..
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Inputting nth number to find the odd or even.
        System.out.print("Enter nth number : ");
        int num = sc.nextInt();

        System.out.println("All odd numbers from 1 to " + num + " are : ");
        // function calling
        oddNumber(num);

        sc.close();
    }
}
