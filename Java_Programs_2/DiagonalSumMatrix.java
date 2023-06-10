
// prg to add two matrices whose row and column of both are same.....
import java.util.*;

class DiagonalSumMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row for matrix    : ");
        int row = sc.nextInt(); // taking row size from user's
        System.out.println("Enter the size of column for matrix : ");
        int col = sc.nextInt(); // taking col size from user's

        int matrix[][] = new int[row][col]; // new array creation of inputed row and column

        if (row == col) { // checking condtion for row and column.....
            // code to get inputs for 1st matrix.....
            System.out.println("Entere elements in [" + row + "] row & [" + col + "] column in matrix: "); // msg
                                                                                                           // display
            for (int i = 0; i < matrix.length; i++) { // this loop is for row
                for (int j = 0; j < matrix[i].length; j++) { // this loop is for column
                    matrix[i][j] = sc.nextInt(); // taking input and storing at matrix1[i][j]
                }
            }
        } else {
            System.out.println("\n Can't Perform this operation... \n");
        }

        // code to print the matrix inputted value......
        System.out.println("Sum of two matrices with [" + row + "] rows & [" + col + "] column are : ");
        for (int i = 0; i < row; i++) { // for row value...
            for (int j = 0; j < col; j++) { // for column value...
                System.out.print(matrix[i][j] + "\t"); // printing the value of matrix.....
            }
            System.out.println();
        }

        // below code for printing the calculated sum which is stored in sum var.....
        System.out.println("Sum of diagonal matrices with [" + row + "] rows & [" + col + "] column are : ");
        int sum = 0;
        for (int i = 0; i < row; i++) { // for row..
            for (int j = 0; j < col; j++) { // for column...
                if (i == j)
                    sum += matrix[i][j]; // adding the diagonal value and storing in sum var....
            }
        }
        System.out.println("Sum of digonal matrix : " + sum); // print the total sum of diagonal matrix...
        sc.close();
    }
}