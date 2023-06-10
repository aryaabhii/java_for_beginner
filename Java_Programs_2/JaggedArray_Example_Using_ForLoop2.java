
// prg for jagged array using forloop....
import java.util.*;

class JaggedArray_Example_Using_ForLoop2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row for jagged array : ");
        int row = sc.nextInt();
        int array[][] = new int[row][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[i + 1];
        }
        System.out.println("Enter elements for Jagged Array are : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of Jagged Array are : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}