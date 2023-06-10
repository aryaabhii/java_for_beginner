
// Prg to take input as string.

import java.util.Scanner;

class ExampleString2 {
    public static void main(String args[]) {
        String str;
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println("String is " + str);
        sc.close();
    }
}