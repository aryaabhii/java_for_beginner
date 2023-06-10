// Find the maximum & minimum number in an array of integers.

import java.util.Scanner;

class Array_5 {
    public static void main(String args[]) {
        // Scanner object creation.
        Scanner sc = new Scanner(System.in);

        // Inputting the size of an array.
        System.out.print("Enter the size of an array : ");
        int size = sc.nextInt();

        // array declaration.
        int array[] = new int[size];

        // Inputting the value in array.
        System.out.println("Enter value for [" + size + "] size array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // for max.
        int max = Integer.MIN_VALUE;

        // for min.
        int min = Integer.MAX_VALUE;

        // checking max and min one by one.
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // this is for min
            }
            if (array[i] > max) {
                max = array[i]; // this is for max
            }
        }

        // prinitng the result.
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

        // closeing object.
        sc.close();
    }
}