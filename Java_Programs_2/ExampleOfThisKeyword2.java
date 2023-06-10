// Example of this keyword to call method.......
// Example of private method.....
// Example of this keyword to represent / refers current object......
class Example {
    private int x, y;

    private void max() {
        if (x > y) {
            System.out.println("Greatest number is " + x);
        } else {
            System.out.println("Greatest number is " + y);
        }
    }

    void input(int a, int b) {
        this.x = a; // explicit use of this keyword....
        this.y = b;
    }

    void display() {
        System.out.println("X is " + this.x + "\n y is " + this.y);
        this.max(); // callimg method using this keyword....
    }
}

class ExampleOfThisKeyword2 {
    public static void main(String args[]) {
        Example e = new Example();
        e.input(200, 300);
        e.display();
    }
}