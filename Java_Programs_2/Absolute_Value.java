
//Program to find the abso

import java.util.Scanner;

class Absolute_Value {
    public static void main(String args[]) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = s.nextInt();

        if (num < 0) {
            System.out.println("Absolute Value = " + (num + (-1)));
        } else {
            System.out.println("Absolute Value = " + (num + 1));
            s.close();
        }

    }
}