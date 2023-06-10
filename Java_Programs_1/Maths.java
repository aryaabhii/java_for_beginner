// Mathematics program

import java.util.*;

class Maths {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.println("Sum : " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Mul : " + (a * b));
        System.out.println("Quo : " + (a / b));
        System.out.println("Rem : " + (a % b));
        sc.close();
    }
}
