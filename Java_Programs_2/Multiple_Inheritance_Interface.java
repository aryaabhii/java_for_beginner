// Example of multiple inheritance of interface....
interface First {
    void display();
}

interface Second {
    void show();
}

interface Third extends First, Second {
    void disp();
}

class MyInterface implements Third {
    public void display() {
        System.out.println("MyInterface.void display()...");
    }

    public void show() {
        System.out.println("MyInterface.void show()...");
    }

    public void disp() {
        int a = 22, b = 11;
        System.out.println("MyInterface.void disp()....");
        System.out.println("Product of " + a + " * " + b + " = " + (a * b));
    }
}

class Multiple_Inheritance_Interface {
    public static void main(String args[]) {
        MyInterface mi = new MyInterface();
        mi.display();
        mi.show();
        mi.disp();
    }
}