// Area and Perimeter of rectangle in java.

import java.util.*;

class Rectangle {
    public static void main(String args[]) {
        System.out.println("Program to print the Area & Perimeter of Rectangle...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter width of Rectangle : ");
        int width = sc.nextInt();
        System.out.println("Area of rectangle : " + (length * width));
        System.out.println("Perimeter of rectangle : " + (2 * (length * width)));
        sc.close();
    }
}