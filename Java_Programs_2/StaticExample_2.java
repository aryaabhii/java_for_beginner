// Example of static fucntion specified in same class where is main() method is specified..
class StaticExample_2 {
    static void display() {
        System.out.println("Welcome to Java World");
    }
}

class DemoStaticExample {
    public static void main(String args[]) {
        StaticExample_2.display();
    }
}