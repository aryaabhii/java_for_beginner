// If Else condition statements.....

import java.util.*;

class IfElse_3 {
    public static void main(String args[]) {
        System.out.println("If else statement example : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int first = sc.nextInt();
        System.out.println("Enter second number : ");
        int second = sc.nextInt();

        if (first == second) {
            System.out.println(first + " is equal to " + second);
        } else if (first > second) {
            System.out.println(first + " is greater.");
        } else {
            System.out.println(second + " is greater.");
        }
        sc.close();
    }
}
