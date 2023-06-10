// Example of single inheritance of interface....
interface First { // base interface First
    void display();

    void show();
}

interface Second extends First { // derived interface Second
    void disp();
}

class MyInterface implements Second { // derived class MyInterface
    public void display() {
        System.out.println("MyInterface.void display()");
    }

    public void show() {
        System.out.println("MyInterface.void show()");
    }

    public void disp() {
        System.out.println("MyInterface.void disp()");
    }
}

class Single_Inheritance_Interface1 {
    public static void main(String args[]) {
        MyInterface mi = new MyInterface();
        mi.display();
        mi.show();
        mi.disp();
    }
}
