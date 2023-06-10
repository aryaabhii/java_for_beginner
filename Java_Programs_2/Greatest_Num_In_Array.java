
// Prg to print the greatest number stored in 1-D array..
import java.util.*;

class Greatest_Num_In_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[];
        array = new int[5];
        System.out.println("Enter five elements : ");
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
        int temp = array[0]; // storing the inputed element temporarly for comparision.
        System.out.println("Inputted Elements are : ");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
            if (array[i] > temp) { // here checking the condtion between array element and temp element.
                temp = array[i];
            }
        }
        System.out.println("Greatest number in array is " + temp);
        sc.close();
    }
}