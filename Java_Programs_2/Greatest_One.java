
// Program to print the greatest number among three numbers using Else if ladder.

import java.util.Scanner;

class Greatest_One {
    public static void main(String args[]) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        num1 = sc.nextInt();
        System.out.println("Enter second number = ");
        num2 = sc.nextInt();
        System.out.println("Enter third number = ");
        num3 = sc.nextInt();
        if (num1 > num2) // checking conditons between 1, 2, & 3
            if (num1 > num3) {
                System.out.println(num1 + " is greatest number.");
            } else {
                System.out.println(num3 + " is greatest number.");
            }
        else if (num2 > num3) {
            System.out.println(num2 + " is greatest number.");
        } else {
            System.out.println(num3 + " is greatest number.");
        }
        sc.close();
    }
}