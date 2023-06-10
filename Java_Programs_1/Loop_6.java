
import java.util.*;

class Loop_6 {
    public static void main(String args[]) {
        System.out.println(
                "Program based on menu driven program. In which the user can enter 2 numbers, either 1 or 0\n");

        // choices to perfoms given operations..........
        System.out.println("choices to calsulate marks...\n");
        System.out.println("press 0 : to stop marks inputting.\n");
        System.out.println("press 1 : to take marks inputs.\n");

        // object creation to take input from Keyboard.
        Scanner sc = new Scanner(System.in);

        // To take inputs from users
        System.out.print("Enter choice : ");
        int choice = sc.nextInt();

        do {
            // inputting marks from users.
            System.out.print("Enter marks : ");
            int marks = sc.nextInt();

            // checking conditions.
            if (marks >= 90) {
                System.out.println("This is good..");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also Good");
            } else if (marks > 0 && marks <= 59) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Not Good.");
            }

            // asking for choice
            System.out.println("Do you want to continue : ");
            choice = sc.nextInt();

        } while (choice == 1);

        // closing the object which created.
        sc.close();
    }
}
