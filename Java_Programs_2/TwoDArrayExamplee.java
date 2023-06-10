// Program to craete 2 - D array by getting inputs of row and columm from users.

import java.util.*;

class TwoDArrayExamplee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row for 2d array: ");
        int row = sc.nextInt();
        System.out.println("Enter col for 2d array: ");
        int col = sc.nextInt();
        int array[][] = new int[row][col];
        System.out.println("Enter elements in 2d array : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Inputted elements in 2d array are : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}