// Prg to find the factorial of number uisng factorial class....
// 6.) WAP to create a class factorial to print the factorial of a number.

import java.util.Scanner;

class Factorial {
    private int num;

    void input(int n) {
        num = n;
    }

    void display() {
        System.out.println("Enterd number is : " + num);
    }

    public void getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}

class ClassFactorial {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = obj.nextInt();
        Factorial f = new Factorial();
        f.input(n);
        f.display();
        f.getFactorial();
        obj.close();
    }
}
