// Example of input and output of strings.

import java.util.Scanner;

class Strings_1 {
    public static void main(String args[]) {
        // Scanner object creation.
        Scanner sc = new Scanner(System.in);

        // Declaration
        String name = new String();

        // inputting.
        System.out.print("Enter name : ");
        name = sc.nextLine();

        // outputting.
        System.out.print("Your name is " + name);

        sc.close();
    }
}