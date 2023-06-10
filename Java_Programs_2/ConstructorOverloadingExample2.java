// example of constructor in java......
// hiding field or instanve variable within class....
class Demo {
    private int x, y; // instance variable...

    Demo(int a, int b) // parameterised constructor..
    {
        x = a;
        y = b;
    }

    void show() {
        System.out.println("X is " + x + "\nY is " + y);
    }
}

class ConstructorOverloadingExample2 {
    public static void main(String args[]) {
        Demo d1 = new Demo(200, 400);
        d1.show();
    }
}

// consclusion: here local variable will be destroyed so the output will be
// zero 0,
