// Example of multilevel inheritance of interface....
interface First { // base interface First......
    void display();
}

interface Second extends First { // intermediate interface Second.......
    void disp();
}

interface Third extends Second { // derive class Third.........
    void show();
}

class MyInterface implements Third {
    public void display() {
        System.out.println("MyInterface.void display()....");
    }

    public void disp() {
        System.out.println("MyInterface.void disp()....");
    }

    public void show() {
        System.out.println("MyInterface.void show()....");
    }
}

class Multilevel_Inheritance_Interface {
    public static void main(String args[]) {
        MyInterface mi = new MyInterface();
        mi.display();
        mi.disp();
        mi.show();
    }
}
