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
}

class Rect extends Shape {
    Rect(int m, int n) {
        super(m, n);
    }

    void getArea() {
        System.out.println("Area is " + (x * y));
    }
}

class Cir extends Shape {
    Cir(int r) {
        super(r, 0);
    }

    void getArea() {
        System.out.println("Area is " + (Math.PI * x * x));
    }
}

class AbstractExample {
    public static void main(String args[]) {
        Rect rr = new Rect(12, 30);
        rr.show();
        rr.getArea();
        Cir cc = new Cir(22);
        cc.show();
        cc.getArea();
    }
}