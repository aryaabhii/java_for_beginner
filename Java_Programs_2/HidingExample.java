// Example of resolving name hiding within class using this keyword....
class Demo {
    private int x, y; // x & y are field or instance variable.....

    void input(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println("X is " + x + "\n Y is " + y);
    }
}

class HidingExample {
    public static void main(String args[]) {
        Demo d = new Demo();
        d.input(200, 400);
        d.show();
    }
}