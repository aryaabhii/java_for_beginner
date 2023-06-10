
//Prg to print the sum of all element sored in 1-D array..
import java.util.*;

class Adding_Array {
    public static void main(String args[]) {
        int array[];
        Scanner sc = new Scanner(System.in);
        array = new int[5];
        System.out.println("Enter five elements : ");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        System.out.println("Inputted elements are : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("Sum of all Inputted element in array : " + sum);
        sc.close();
    }
}