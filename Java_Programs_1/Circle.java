
// Radius and Circumferance of circle in java.
// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
import java.util.*;

class Circle {
    public static void main(String args[]) {
        System.out.println("Program to print the radius & circumference of circle...");
        double pie = 3.14; // fixed value of pie.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius = sc.nextInt();
        // This is for circle circumference......
        System.out.println("Circumference of circle : " + (2 * pie * radius));
        // This is for circle radius.......
        // formula to find the area of circle is
        // pie radius * 2

        // Below code for circumference...
        System.out.println("Area of circle : " + (pie * radius * radius));
        System.out.print("Enter circumference : ");
        double circumference = sc.nextDouble();
        System.out.println("Area of circle : " + (circumference / (2 * pie)));
        sc.close();
    }
}