
// prg to add two matrices whose row and column of both are same.....
import java.util.*;

class AddingTwoMatrices {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of row for 1st matrix    : ");
        int row = sc.nextInt(); // taking row size from user's
        System.out.println("Enter the size of column for 1st matrix : ");
        int col = sc.nextInt(); // taking column size from user's

        // code to get inputs for 1st matrix
        int matrix1[][] = new int[row][col]; // new 1st array creation of inputed row and column
        System.out.println("Entere elements in [" + row + "] row & [" + col + "] column in 1st matrix: "); // msg
                                                                                                           // display
        for (int i = 0; i < matrix1.length; i++) { // this loop is for row
            for (int j = 0; j < matrix1[i].length; j++) { // this loop is for column
                matrix1[i][j] = sc.nextInt(); // taking input and storing at matrix1[i][j]
            }
        }

        // code to get inputs for 2nd matrix
        int matrix2[][] = new int[row][col]; // new 2nd array creation of inputed row and column
        System.out.println("Entere elements in [" + row + "] row & [" + col + "] column in 2nd matrix: "); // msg
                                                                                                           // display
        for (int i = 0; i < matrix2.length; i++) { // this loop is for row
            for (int j = 0; j < matrix2[i].length; j++) { // this loop is for column
                matrix2[i][j] = sc.nextInt(); // taking input and storing at matrix2[i][j]
            }
        }

        // code to caluclate the sum of two matrices
        int sum[][] = new int[row][col]; // new sum[][] is defined for storing the calculated values
        for (int i = 0; i < row; i++) { // this is for row
            for (int j = 0; j < col; j++) { // this is for col
                sum[i][j] = matrix1[i][j] + matrix2[i][j]; // calculating the sum of 1st and 2nd matrix[][] and storing
                                                           // in sum[][]
            }
        }

        // below code for printing the calculated sum which is stored in sum var.
        System.out.println("Sum of two matrices with [" + row + "] rows & [" + col + "] column are : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}