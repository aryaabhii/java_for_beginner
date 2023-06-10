// Make a Calculator.
// Take 2 numbers (a & b) from the user and an operation as follows :

import java.util.*;

class SwitchCase_2 {
    public static void main(String args[]) {
        System.out.println("Program based on Switch case : \n");

        // Keys Information.
        System.out.println("Keys to perform following Arithmetics Operations :");
        System.out.println("1 : for Addition");
        System.out.println("2 : for Subtraction");
        System.out.println("3 : for Multiplication");
        System.out.println("4 : for Quotient");
        System.out.println("5 : for Remainder");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();

        // Inputting key to perform Arithmetic Operation
        System.out.print("Enter key : ");
        int button = sc.nextInt();

        // code for switch case...
        switch (button) {
            case 1:
                System.out.println(first + " + " + second + " = " + (first + second));
                break;

            case 2:
                System.out.println(first + " - " + second + " = " + (first - second));
                break;

            case 3:
                System.out.println(first + " * " + second + " = " + (first * second));
                break;

            case 4:
                if (second == 0) {
                    System.out.println("Invalid! Divison Can not perform.");
                    break;
                } else {
                    System.out.println(first + " / " + second + " = " + (first / second));
                    break;
                }

            case 5:
                if (second == 0) {
                    System.out.println("Invalid! Divison Can not perform.");
                    break;
                } else {
                    System.out.println(first + " % " + second + " = " + (first % second));
                    break;
                }

            default:
                System.out.println("Not a valid Key.");
        }

        sc.close();

    }
}