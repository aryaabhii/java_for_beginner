// If Else condition statements.....

import java.util.*;

class IfElse_2 {
    public static void main(String args[]) {
        System.out.println("If else statement example : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check whether nnumber is odd or even : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is odd number.");
        }
        sc.close();
    }
}