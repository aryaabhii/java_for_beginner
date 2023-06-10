
//Program to print all prime number stored in 1-D array.
import java.util.*;

class Prime_Number_In_Array {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        System.out.println("Enter five elements : ");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Inputted elements are below : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        int Faccount = array[0];
        System.out.println("Prime numbers in inputted elements are : ");
        for (int i = 0; i < 5; i++) {
            if (array[i] % 2 == 0) {
                Faccount = Faccount + 1;
            }
        }
        if (Faccount == 2) {
            System.out.println(Faccount);
        }
        sc.close();
    }
}