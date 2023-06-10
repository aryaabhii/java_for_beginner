// Take an array of numbers as input and check if it is an array sorted in
// ascending order.
// Eg : { 1, 2, 4, 7 } is sorted in ascending order.
// {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;

class Array_6 {
    public static void main(String args[]) {

        // creating a scanner class.
        Scanner sc = new Scanner(System.in);

        // taking input for the size of array.
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        // declaration of array.
        int array[] = new int[size];

        // taking input from user for an array.
        System.out.println("Enter the value for [" + size + "] arary : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // for ascending check.
        boolean isAscending = true;

        for (int i = 0; i < array.length - 1; i++) { // NOTICE numbers.length - 1 as termination condition
            if (array[i] > array[i + 1]) { // This is the condition for descending order
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

        // scanner object close.
        sc.close();
    }
}