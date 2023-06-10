class Shape {
    String color;
    //
}

class Triange extends Shape {

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

public class OopsInheritance {
    public static void main(String args[]) {
        Triange t1 = new Triange();

        t1.color = "Red";

    }
}