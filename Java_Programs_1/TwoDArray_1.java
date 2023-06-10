// Example of 2d Array...

import java.util.Scanner;

class TwoDArray_1 {
    public static void main(String args[]) {
        // scanner object.
        Scanner sc = new Scanner(System.in);

        // inputting for row.
        System.out.print("Enter the size of row : ");
        int rows = sc.nextInt();

        // inputting for column.
        System.out.print("Enter the size of column : ");
        int cols = sc.nextInt();

        // declaraing 2d array.
        int matrix[][] = new int[rows][cols];

        // inputting value in matrix.
        System.out.println("Enter value for [" + rows + "] row & [" + cols + "] columns :");

        // it is for row.
        for (int i = 0; i < rows; i++) {
            // it is for column.
            for (int j = 0; j < cols; j++) {
                // for putting value in rows and cols.
                matrix[i][j] = sc.nextInt();
            }
        }

        // outputting the value of matrix.
        System.out.println("Your matrix of [" + rows + "] & [" + cols + "] columns are :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}