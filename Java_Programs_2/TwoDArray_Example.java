// Program for create 2d array.

import java.util.*;

class TwoDArray_Example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[2][5];
        System.out.println("Enter elements: ");
        for (int i = 0; i < array.length; i++) { // here length keyword is used to determine the size of array.
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enterd elements are: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}