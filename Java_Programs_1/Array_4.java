// Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

class Array_4 {
    public static void main(String args[]) {
        // scanner object creation.
        Scanner sc = new Scanner(System.in);

        // inputting size of array.
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        // array declaration for string type.
        String name[] = new String[size];

        // Inputting the name from user.
        System.out.println("Enter name for [" + size + "] size array :");
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }

        // Printing the names.
        System.out.println("Enterd name for [" + size + "] size array are :");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name " + (i + 1) + " : " + name[i]);
        }

        // closing the object.
        sc.close();
    }
}