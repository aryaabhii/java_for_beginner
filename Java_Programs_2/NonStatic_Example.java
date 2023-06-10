// non static method specified in different class from main() method...

class NonStatic_Example {
    void display() {
        System.out.println("Hello World");
    }
}

class DemoMethod {
    public static void main(String[] args) {
        NonStatic_Example d = new NonStatic_Example();
        d.display();
    }
}