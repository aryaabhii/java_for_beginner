
//  program to create a function sum() to sum all elements sored in 1-D Array getting Input from Keywords..
import java.util.*;

class PassingOfArrayIn_One_D_Array_Example_2 {
    void sum(int array[]) {
        int sum = 0;
        System.out.println("\n ELEMENTS OF AN ARRAY ARE :-");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Sum : " + sum);
    }

    public static void main(String args[]) {
        PassingOfArrayIn_One_D_Array obj = new PassingOfArrayIn_One_D_Array();
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Enter elements for an array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        obj.sum(array);
        sc.close();
    }
}