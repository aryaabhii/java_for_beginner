// Write a function which takes in 2 numbers and returns the greater those two.

import java.util.Scanner;

class PracticeQuestion_3 {
    // function for greater.
    public static int greaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    // main function.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Inputting two number..
        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();

        // calling function
        System.out.println(greaterNumber(first, second) + " is greatest.");

        sc.close();

    }
}
