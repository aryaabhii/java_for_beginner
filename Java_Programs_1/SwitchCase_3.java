// Ask the user to enter the number of the month & print the name of the month.
// For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

import java.util.*;

class SwitchCase_3 {
    public static void main(String main[]) {
        System.out.println("Program based on Switch case statement. \n");

        // Keys Information.
        System.out.println("Key to print months name..\n");
        System.out.println("1  : January");
        System.out.println("2  : February");
        System.out.println("3  : March");
        System.out.println("4  : April");
        System.out.println("5  : May");
        System.out.println("6  : June");
        System.out.println("7  : July");
        System.out.println("8  : August");
        System.out.println("9  : September");
        System.out.println("10 : October");
        System.out.println("11 : November");
        System.out.println("12 : December");

        // Scanning key value form input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key : ");
        int key = sc.nextInt();

        // Switch case statement..
        switch (key) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("January");
        }

        sc.close();
    }
}
