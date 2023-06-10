// Example of interface implemented by a class...
interface First { // base interface First
    void display();

    void show();
}

interface Second {
    void disp();
}

class MyInterface implements First, Second { // derive interface MyInterface

    public void display() {
        System.out.println("MyInterface.display()");
    }

    public void show() {
        System.out.println("MyInterface.show()");
    }

    public void disp() {
        System.out.println("MyInterface.disp()");
    }
}

class Interface_Implemented_Class {
    public static void main(String args[]) {
        MyInterface mi = new MyInterface();
        mi.display();
        mi.show();
        mi.disp();
    }
}