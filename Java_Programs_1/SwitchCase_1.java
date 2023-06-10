// Example of Switch case in java....

import java.util.*;

class SwitchCase_1 {
    public static void main(String args[]) {
        System.out.println("Program based on Switch Statements......");

        System.out.println("Enter 1 to print Hello ");
        System.out.println("Enter 2 to print Namstey ");
        System.out.println("Enter 3 to print Pranam ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namstey");
                break;
            case 3:
                System.out.println("Pranam");
                break;
            default:
                System.out.println("Wrong Input");
                break;
        }

        sc.close();
    }
}