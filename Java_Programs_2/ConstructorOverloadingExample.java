// example of constructor in java......
class Demo {
    private int x, y;

    Demo(int a, int b) { // parameterised constructor..
        x = a;
        y = b;
    }

    // constuctor is alws of class...
    Demo() { // no argument
        x = 1;
        y = 2;
    }

    Demo(int a) { // one argument
        x = y = a;
    }

    void show() {
        System.out.println("X is " + x + "\n Y is " + y);
    }
}

class ConstructorOverloadingExample {
    public static void main(String args[]) {
        Demo d1 = new Demo(200, 400);
        Demo d2 = new Demo(500);
        Demo d3 = new Demo();
        d1.show();
        d2.show();
        d3.show();
    }
}
