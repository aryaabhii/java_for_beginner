
//Program to get input and display in 1-D Array.
import java.util.*;

class Array_Example {
    public static void main(String args[]) {
        int x[]; // array variable declaration.
        Scanner sc = new Scanner(System.in); // creating obj for an array.
        x = new int[5]; // inputting value in array.
        System.out.println("Enter five elements :");
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt(); // putting value one by one on index 0 to 5.
        }
        System.out.println("Enterd Elements are :");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i]); // printing the value of inputted data.
        }
        sc.close(); // closeing the object.
    }
}
