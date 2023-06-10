// example of default constructor......
class Demo {
    int y, x;

    void show() {
        System.out.println("X is " + x + "\n Y is " + y);
    }
}

class DemoDefault {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.show();
    }
}