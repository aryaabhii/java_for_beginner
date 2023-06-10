import java.util.Scanner;

// Take a matrix as input from the use. Search for given number X and print the
// indices at which it occurs.

class TwoDArray_2 {
    public static void main(String args[]) {
        // Scanner object.
        Scanner sc = new Scanner(System.in);

        // Inputting the size of row.
        System.out.print("Enter the size of row : ");
        int rows = sc.nextInt();

        // Inputting the size of column.
        System.out.print("ENter the size of column : ");
        int cols = sc.nextInt();

        // declaring 2d array.
        int matrix[][] = new int[rows][cols];

        // inputting values in 2d array or matrix.
        System.out.println("Enter values for [" + rows + "] rows & [" + cols + "] columns : ");

        // for outer loop or rows.
        for (int i = 0; i < rows; i++) {
            // for inner loop or columns.
            for (int j = 0; j < cols; j++) {
                // for putting value in rows and cols.
                matrix[i][j] = sc.nextInt();
            }
        }

        // Taking inpnut for search the value from matrix.
        System.out.print("Which numner you want to search from the matrix : ");
        int search = sc.nextInt();

        // for outer loop or rows.
        for (int i = 0; i < matrix.length; i++) {
            // for inner loop or columns.
            for (int j = 0; j < matrix[i].length; j++) {
                // condition for search the value.
                if (matrix[i][j] == search) {
                    System.out.print(search + " found at location " + "[" + i + "]" + "[" + j + "]");
                }
            }
        }
        sc.close();
    }
}
