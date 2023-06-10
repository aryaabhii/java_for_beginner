// Example of array.

import java.util.Scanner;

class Array_2 {
    public static void main(String args[]) {
        // scanner object for inputting.
        Scanner sc = new Scanner(System.in);

        // inputting the size of an array.
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        // array declaration.
        int array[] = new int[size];

        // inputting the value of array from user.
        System.out.println("Enter value of [" + size + "] size arary : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // outputting the value of array
        System.out.println("Value of [" + size + "] size arary : ");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}