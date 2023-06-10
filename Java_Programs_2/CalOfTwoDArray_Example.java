
// Program to calculte the sum of 2-D array.
import java.util.*;

class CalOfTwoDArray_Example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int col = sc.nextInt();
        int array[][] = new int[row][col];
        System.out.println("Enter elements in [" + row + "] row & [" + col + "] column in 2-D array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enterd elements of [" + row + "] row & [" + col + "] column in 2-D array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0, product = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                product *= array[i][j];
            }
        }
        System.out.println("Sum of     [" + row + "] row & [" + col + "] are : " + sum);
        System.out.println("Product of [" + row + "] row & [" + col + "] are : " + product);
        System.out.println(array.getClass());
        sc.close();
    }
}