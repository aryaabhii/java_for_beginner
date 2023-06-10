
// Prg to create a Rect class and find area & perimeter......
// 2.) WAP to create a class rectangle to print area & perimeter of rectangle. 

import java.util.*;

class Rect {
    private int length, breadth;

    void input(int l, int b) {
        length = l;
        breadth = b;
    }

    void display() {
        System.out.println("Length of Rectange : " + length);
        System.out.println("Length of Rectange : " + breadth);
    }

    public void rectAea() {
        System.out.println("Area of rectange whose length is " + length + " & breadth is " + breadth + " = "
                + (length + breadth));
    }

    public void rectPerimeter() {
        System.out.println("Perimeter of rectange whose length is " + length + " & breadth is " + breadth + " = "
                + (2 * (length + breadth)));
    }
}

class ClassRectangle {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter length of rectange : ");
        int l = obj.nextInt();
        System.out.print("Enter breadth of rectange : ");
        int b = obj.nextInt();
        Rect r = new Rect();
        r.input(l, b);
        r.display();
        r.rectAea();
        r.rectPerimeter();
        obj.close();
    }
}
