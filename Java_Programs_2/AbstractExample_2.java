// Example of abstract class first type.......
abstract class Shape {
    int x, y;

    Shape(int a, int b) {
        x = a;
        y = b;
    }

    void show() {
        System.out.println("X is " + x + "\n Y is " + y);
    }

    public void getArea() {
    }
}

class Rect extends Shape {
    Rect(int m, int n) {
        super(m, n);
    }

    public void getArea() {
        System.out.println("Area is " + (x * y));
    }
}

class Cir extends Shape {
    Cir(int r) {
        super(r, 0);
    }

    public void getArea() {
        System.out.println("Area is " + (Math.PI * x * x));
    }
}

class AbstractExample {
    public static void main(String args[]) {
        Shape ss;
        Rect rr = new Rect(7, 30);
        ss = rr;
        ss.show();
        ss.getArea();
        Cir cc = new Cir(5);
        ss = cc;
        cc.show();
        cc.getArea();
    }
}