
// prg for jagged array .....
import java.util.*;

class JaggedArray_Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object creation
        int array[][] = new int[5][]; // new arrray creation
        array[0] = new int[3]; // fix size for 1st jagged array
        array[1] = new int[2]; // fix size for 2nd jagged array
        array[2] = new int[4]; // fix size for 3rd jagged array
        array[3] = new int[3]; // fix size for 4th jagged array
        array[4] = new int[5]; // fix size for 5th jagged array
        System.out.println("Enter [3] elements in array[0] : ");
        for (int i = 0; i < 3; i++) {
            array[0][i] = sc.nextInt(); // elements entry on array[0]
        }
        System.out.println("Enter [2] elements in array[1] : ");
        for (int i = 0; i < 2; i++) {
            array[1][i] = sc.nextInt(); // elements entry on array[1]
        }
        System.out.println("Enter [4] elements in array[2] : ");
        for (int i = 0; i < 4; i++) {
            array[2][i] = sc.nextInt(); // elements entry on array[2]
        }
        System.out.println("Enter [3] elements in array[3] : ");
        for (int i = 0; i < 3; i++) {
            array[3][i] = sc.nextInt(); // elements entry on array[3]
        }
        System.out.println("Enter [5] elements in array[4] : ");
        for (int i = 0; i < 5; i++) {
            array[4][i] = sc.nextInt(); // elements entry on array[4]
        }
        // code to display the inputted data
        System.out.println("Jagged array are as : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(array[0][i] + "\t"); // displaying inputted elements of array[0]
        }
        System.out.println("\n---------------------------------------");
        for (int i = 0; i < 2; i++) {
            System.out.print(array[1][i] + "\t"); // displaying inputted elements of array[1]
        }
        System.out.println("\n---------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.print(array[2][i] + "\t"); // displaying inputted elements of array[2]
        }
        System.out.println("\n---------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.print(array[3][i] + "\t"); // displaying inputted elements of array[3]
        }
        System.out.println("\n---------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[4][i] + "\t"); // displaying inputted elements of array[4]
        }
        System.out.println("\n---------------------------------------");
        sc.close();
    }
}