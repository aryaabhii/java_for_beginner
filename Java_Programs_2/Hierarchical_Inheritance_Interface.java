// Example of hierarchical inheritance of interface....
interface First { // base class First.
    void display();
}

interface Second extends First { // derive class Second...
    void show();
}

interface Third extends First { // derive class Third.....
    void disp();
}

interface Four extends First { // derive class Four.....
    void sum();
}

class MyInterface implements Second, Third, Four {
    public void display() {
        System.out.println("MyInterface.void display()....");
    }

    public void show() {
        System.out.println("MyInterface.void show()....");
    }

    public void disp() {
        System.out.println("MyInterface.void disp()....");
    }

    public void sum() {
        int a = 24, b = 44;
        System.out.println("Sum of " + a + " + " + b + " = " + (a + b));
    }
}

class Hierarchical_Inheritance_Interface {
    public static void main(String args[]) {
        MyInterface mi = new MyInterface();
        mi.display();
        mi.show();
        mi.disp();
        mi.sum();
    }
}