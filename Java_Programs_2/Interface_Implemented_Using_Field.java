// Interface_Implemented_Using_Field
// Example of Inheritance using field...

import java.util.Scanner;

interface Shape { // base interface
    double PI = 3.14;

    void getArea(int l, int b);
}

class Rectangle implements Shape { // derive interface Rectangle
    public void getArea(int l, int b) {
        System.out.println("Area of Rectangle : " + (l * b));
    }
}

class Circle implements Shape { // derive interface Circle
    public void getArea(int l, int b) {
        System.out.println("Area of Circle : " + (PI * l * l));
    }
}

class Interface_Implemented_Using_Field {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        int l, b;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Length  : ");
        l = obj.nextInt();
        System.out.print("Enter Breadth : ");
        b = obj.nextInt();
        r.getArea(l, b);
        Circle c = new Circle();
        System.out.print("Enter Radius : ");
        l = obj.nextInt();
        c.getArea(l, 0);
        obj.close();
    }
}