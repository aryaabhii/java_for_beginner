
//  program to create to pass primitive types .
//  call by reference behaviour in JAVA.....
import java.util.*;

class PassingOfArrayIn_1__Array_Example_4 {
    void sum(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 100;
        }

    }

    public static void main(String args[]) {
        PassingOfArrayIn_1__Array_Example_4 obj = new PassingOfArrayIn_1__Array_Example_4();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1 - D array : ");
        int num = sc.nextInt();
        int array[] = new int[num];
        System.out.println("Enter [" + array.length + "] elements for arary : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enterd [" + array.length + "] elements of arary before perform sum function : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        obj.sum(array);
        System.out.println("Enterd [" + array.length + "] elements of arary after perform sum function : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        sc.close();
    }
}