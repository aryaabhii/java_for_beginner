// example of this keyword ito represent current object......
class Example {
    private int x, y;

    void input(int a, int b) {
        this.x = a;
        this.y = b;
    }

    void display() {
        System.out.println("X is " + this.x + "\n Y is " + this.y);
    }

}

class ExampleOfThisKeyword {
    public static void main(String args[]) {
        Example e = new Example();
        e.input(200, 400);
        e.display();
    }
}
