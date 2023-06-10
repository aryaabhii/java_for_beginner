// example of constructor in java......
// hiding field or instanve variable within class....
class Demo {
    private int x, y; // instance variable...

    void input(int a, int b) // parameterised constructor..
    {
        x = a;
        y = b;
    }

    void show() {
        System.out.println("X is " + x + "\n Y is " + y);
    }
}

class ConstructorOverloadingExample3 {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.input(200, 400);
        d.show();
    }
}

// consclusion: here local variable will be destroyed so the output will be
// zero 0,