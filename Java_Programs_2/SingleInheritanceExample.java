// Example of Single Inheritance...
class Demo {
    private int x;
    int y;

    void input(int a, int b) {
        x = a; // x will not inherit bcz it has private access specifier....
        y = b;
    }

    public void showData() {
        System.out.println("X is " + x + "\n Y is " + y);
    }

    int getX() {
        return (x);
    }

}

class Sum extends Demo // Derive Class Sum....
{
    private int s;

    void getSum() {
        s = y + getX();
        System.out.println("Sum is " + s);
    }

}

class SingleInheritanceExample {
    public static void main(String args[]) {
        Sum ss = new Sum();
        ss.input(10, 20);
        ss.showData();
        ss.getSum();
    }
}
