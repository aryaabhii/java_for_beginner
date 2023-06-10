
//  program to create a function sum() to sum all elements sored in 2-D Array..
import java.util.*;

class PassingOfArrayIn_2_D_Array {
    void sum(int array[][]) {
        System.out.println("\n ELEMENTS OF AN ARRAY ARE :-");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        PassingOfArrayIn_2_D_Array obj = new PassingOfArrayIn_2_D_Array();
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[2][3];
        System.out.println("Enter [" + array.length + "] row & [" + array.length + "] elements for  2-D arary : ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        obj.sum(array);
        sc.close();
    }
}