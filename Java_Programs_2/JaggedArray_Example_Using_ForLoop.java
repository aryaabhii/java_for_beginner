
// prg for jagged array using forloop....
import java.util.*;

class JaggedArray_Example_Using_ForLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[5][];
        array[0] = new int[3]; // fix size for 1st jagged array
        array[1] = new int[2]; // fix size for 2nd jagged array
        array[2] = new int[4]; // fix size for 3rd jagged array
        array[3] = new int[3]; // fix size for 4th jagged array
        array[4] = new int[5]; // fix size for 5th jagged array
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