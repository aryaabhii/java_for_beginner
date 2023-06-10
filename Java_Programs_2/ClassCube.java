
// Prg to print the cube of a number using cunbe class....
// 4.) WAP in JAVA to create a class sum to print the sum of two numbers.
import java.util.Scanner;

class Cube {
    private int num;

    void input(int n) {
        num = n;
    }

    void display() {
        System.out.println("The inputted number is " + num);
    }

    public void getCube() {
        System.out.println("Cube of " + num + " = " + (num * num * num));
    }
}

class ClassCube {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = obj.nextInt();
        Cube c = new Cube();
        c.input(n);
        c.display();
        c.getCube();
        obj.close();
    }
}