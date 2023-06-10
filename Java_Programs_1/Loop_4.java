// Program based on looping concept and switch case...

import java.util.*;

class Loop_4 {
    public static void main(String args[]) {
        System.out.println(
                "Printing all nth even & odd number also finding the sum of all Even & Odd number using switch case..\n");

        // Basic keys message for users......
        System.out.println("Keys to find the odd and even: \n");
        System.out.println("Press ' e ' to find the even: ");
        System.out.println("Press ' o ' to find the odd:  ");

        // Keys scanning.........
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        String key = sc.next();

        // Scanning nth number from user's.
        System.out.print("Enter nth number : ");
        int num = sc.nextInt();

        int sum = 0; // declaration

        switch (key) {
            // this case for even number.
            case "e":
                for (int i = 1; i <= num; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                        sum = sum + i;
                    }
                }
                System.out.println("Sum of all even number : " + sum);
                break;

            // this case for odd number.
            case "o":
                for (int i = 1; i <= num; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                        sum = sum + i;
                    }
                }
                System.out.println("Sum all odd number : " + sum);
                break;

            default:
                System.out.println("Invalid! Option...");
        }
        sc.close();
    }
}