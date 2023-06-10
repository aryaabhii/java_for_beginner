// Example of strigs.

import java.util.Scanner;

class Strings_2 {
    public static void main(String args[]) {
        // scanner object.
        Scanner sc = new Scanner(System.in);

        // Inputting.
        System.out.print("Enter your first name : ");
        String firstName = sc.next();
        System.out.print("Enter you last name   : ");
        String lastName = sc.next();

        // concatenation.
        String fullName = firstName + " " + lastName;

        // outputting.
        System.out.println("Your full name is " + fullName);

        // length() builtin function.
        System.out.print("Length of string : " + fullName.length());

        // closing object.
        sc.close();
    }

}