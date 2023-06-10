// Example of arary to print the array and search a specific value which user want.

import java.util.Scanner;

class Array_3 {
    public static void main(String args[]) {
        // Scanner object.
        Scanner sc = new Scanner(System.in);

        // Inputting the size of an array from user.
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        // Array declaration.
        int array[] = new int[size];

        // Taking the input for array.
        System.out.println("Enter the value for [" + size + "] size array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Taking input to search specific value.
        System.out.print("Which number you want to search from enterd array : ");
        int search = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            // searcing the value.
            if (array[i] == search) {
                System.out.println(search + " is found at index [" + i + "]");
            }
        }

        sc.close();
    }
}