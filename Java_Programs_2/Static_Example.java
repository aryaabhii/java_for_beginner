// Example of static fucntion specified in same class where is main() method is specified....
class Static_Example {
    static void display() {
        System.out.print("Welcome to JAVA World\n");
    }

    public static void main(String args[]) {
        display();
        Static_Example.display();
    }
}