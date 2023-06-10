//Example of single inheritance example...
class Num {
    protected int x;

    void input(int a) {
        x = a;
    }

    void show() {
        System.out.println("X is " + x);
    }
}

class Num1 extends Num {
    private int y;

    void getData(int b) {
        y = b;
    }

    void show() {
        System.out.println("Y is " + y);
    }
}

class Sum extends Num {
    private int s;

    void getSum(int y) {
        s = x + y;
        System.out.println("Sum of " + x + " + " + y + " =  : " + s);
    }

}

class SingleInheritanceExample1 {
    public static void main(String args[]) {
        Sum ss = new Sum();
        ss.input(85);
        ss.show();
    }
}