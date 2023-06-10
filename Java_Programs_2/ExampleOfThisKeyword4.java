// example of this keyword to call no argument constructor.......
class Example {
    private int x, y, z;

    Example(int a, int b) {
        // System.out.println("This is no argumnet constructor........");
        x = y = a;
        z = b;
    }

    Example(int a, int b, int c) {
        this(500, 300); // invokes parameterised constructor of same class ........
        x = a;
        y = b;
        z = c;
    }

    void show() {
        System.out.println("X is " + x + "\n Y is " + y + "\n Z is " + z);
    }
}

class ExampleOfThisKeyword4 {
    public static void main(String args[]) {
        Example e = new Example(10, 20, 30);
        e.show();
    }
}