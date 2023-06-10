// example of default no arrgument constructor......
class Demo {
    private int x, y;

    Demo() // no argument constructor..
    {
        x = 25;
        y = 30;
        // System.out.println("This is demo of no argument constructor.....");
    }

    // constuctor is alws of class...
    void show() {
        System.out.println("X is " + x + "\n Y is " + y);
    }
}

class DefaultConstructorExample3 {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.show();
    }
}