// example of this keyword to call no argument constructor.......
class Example {
    private int x, y, z;

    Example() {
        System.out.println("This is no argumnet constructor........");
    }

    Example(int a, int b, int c) {
        this();
        x = a;
        y = b;
        z = c;
    }

    void show() {
        System.out.println("X is " + x + "\n Y is " + y + "\n Z is " + z);
    }
}

class ExampleOfThisKeyword3 {
    public static void main(String args[]) {
        Example e = new Example(10, 20, 30);
        e.show();
    }
}