
// Prg to print the product of odd number stored in 1-D array..
import java.util.*;

class Product_Of_Odd_In_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[];
        array = new int[5];
        System.out.println("Enter five elements : ");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Inputted elements are : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        int product = array[1];
        System.out.println("Odd Number from inputted elements are : ");
        for (int i = 0; i < 5; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
                product *= array[i];
            }
        }
        System.out.println("Product of total odd : " + product);
        sc.close();
    }
}