class Shape {
    public void display() {
        System.out.println("Area display : ");
    }
}

class Triange extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of triangle : " + 1 / 2 * h + l);
    }
}

class EquilateralTriange extends Triange {
    public void area(int l, int h) {
        System.out.println("Area of Equilateral triangle : " + 1 / 2 * l + h);
    }
}

// Inheritance :
// when the peoperty of one class wants to take another class then this process
// is called inheritance.

// another way we can say inherit od one class properties to another class that
// is called inheritance.

// Inheritance provide reusability in code.

// Four kinds of Inheritance in JAVA.
// 1.) Single level : Base Class -> Derived Class
// 2.) Multi level : Base Class -> Derived Class -> Derived Class
// 3.) Hierarchial : Base Class -> 1.) Derived Class 2.) Derived Class
// 4.) Hybrid : In this all three type are occupied.

// 5.) Multiple Inheritance is not the type of java it is used in C++ languages.

public class OopsMulti_LevelInheritance {
    public static void main(String args[]) {
        Triange t1 = new Triange();
        t1.area(12, 6);

        EquilateralTriange t2 = new EquilateralTriange();
        t2.area(20, 10);

    }
}