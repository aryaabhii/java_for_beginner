// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class PracticeQuestion_4 {
    // function for circumference.
    public static double circleCircumference(int radius) {
        double pie = 3.14;
        double circumference = 2 * pie * radius;
        return circumference;
    }

    // main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Inputting raius of a circle.
        System.out.print("Enter the radius of circle : ");
        int radius = sc.nextInt();

        // calling function and printing value...
        System.out.println("Circumference of circle : " + circleCircumference(radius));

        sc.close();
    }
}
