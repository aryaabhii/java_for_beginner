// Program based on switch statement using string ...

import java.util.*;

class SwitchCase_4 {
    public static void main(String args[]) {
        System.out.println("Program based on Switch case statement. \n");

        System.out.println("Key to print months name..\n");

        // Keys Information.
        System.out.println("A  : January");
        System.out.println("B  : February");
        System.out.println("C  : March");
        System.out.println("D  : April");
        System.out.println("E  : May");
        System.out.println("F  : June");
        System.out.println("G  : July");
        System.out.println("H  : August");
        System.out.println("I  : September");
        System.out.println("J  : October");
        System.out.println("K  : November");
        System.out.println("L  : December");

        // For Key inputs.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        String c = sc.nextLine();

        // switch case statements.
        switch (c) {
            case "A":
                System.out.println("January");
                break;
            case "B":
                System.out.println("February");
                break;
            case "C":
                System.out.println("March");
                break;
            case "D":
                System.out.println("April");
                break;
            case "E":
                System.out.println("May");
                break;
            case "F":
                System.out.println("June");
                break;
            case "G":
                System.out.println("July");
                break;
            case "H":
                System.out.println("August");
                break;
            case "I":
                System.out.println("Sepetember");
                break;
            case "J":
                System.out.println("October");
                break;
            case "K":
                System.out.println("November");
                break;
            case "L":
                System.out.println("May");
                break;
            default:
                System.out.println("Wrong Input.");
        }

        sc.close();
    }
}