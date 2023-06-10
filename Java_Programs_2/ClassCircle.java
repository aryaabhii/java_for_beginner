
// Prg to create a Cir class and find curcumference......
// 3.) WAP to create a class circle to print area & circumference of circle. 

import java.util.Scanner;

class Cir {
    private int radius;

    void input(int r) {
        radius = r;
    }

    void display() {
        System.out.println("Radius of circle : " + radius);
    }

    public void getCircumference() {
        System.out.println("Circumfernce of circle whose radius " + radius + " = " + (2 * (22 / 7 * radius)));
    }
}

class ClassCircle {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int r = obj.nextInt();
        Cir c = new Cir();
        c.input(r);
        c.display();
        c.getCircumference();
        obj.close();
    }
}
