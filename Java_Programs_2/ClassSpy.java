// Prg to check inputted number is spy number or nor usig Spy class.....
// 7.) WAP to create spy to check a number is spy or not ?

import java.util.Scanner;

class Spy {
    private int num;

    void input(int n) {
        num = n;
    }

    void display() {
        System.out.println("Entered number is " + num);
    }

    public void getSpy() {
        int sum = 0, product = 1;
        while (num > 0) {
            // finds the last digit of the number
            int lastdigit = num % 10;
            // adds last digit to the variable sum
            sum = sum + lastdigit;
            // calculates the product..
            product = product * lastdigit;
            // removes the last digit from the given number
            num = num / 10;
        }
        // compares the sum and product
        if (sum == product) {
            // prints if the above condition returns true
            System.out.println("The given number is a spy number.");
        } else {
            // prints if the above condition returns false
            System.out.println("The given number is not a spy number.");
        }
    }
}

class ClassSpy {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number to check spy or nor : ");
        int n = obj.nextInt();
        Spy s = new Spy();
        s.input(n);
        s.display();
        s.getSpy();
        obj.close();
    }
}