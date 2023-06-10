// Example of multiple inheritance of interface....
interface First { // base interface..
    void display();

    void show();

    void disp();
}

abstract class MyAbstract implements First { // Here MyInterface is abstract class.
    public void display() {
        System.out.println("MyInterface.void display()");
    }

    public void show() {
        System.out.println("MyInterface.void show()");
    }
}

class MyInterface extends MyAbstract {
    public void disp() {
        System.out.println("MyInterface.void disp()");
    }
}

class Partial_Implementation_Interface {
    public static void main(String args[]) {
        MyInterface mi = new MyInterface();
        mi.display();
        mi.show();
        mi.disp();
    }
}