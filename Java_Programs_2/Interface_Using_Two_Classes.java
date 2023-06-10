// Example of an interface implemented two classes.....
interface First { // base interface First
    void display();

    void show();
}

class MyInterface implements First { // derive interface MyInterface
    public void display() {
        System.out.println("MyInterface.display()");
    }

    public void show() {
        System.out.println("MyInterface.show()");
    }
}

class MySecondInterface implements First { // derive interface MySecondInterface
    public void display() {
        System.out.println("MySecondInterface.display()");
    }

    public void show() {
        System.out.println("MySecondInterface.show()");
    }
}

class Interface_Using_Two_Classes {
    public static void main(String args[]) {
        First f = new MyInterface();
        f.display();
        f.show();
        f = new MySecondInterface();
        f.display();
        f.show();
    }
}