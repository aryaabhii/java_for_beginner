// Example of default
class ClassExample {
    int x, y; // default access modifier....
}

class ClassExampleC {
    public static void main(String args[]) {
        ClassExample ce = new ClassExample();
        ce.x = 25;
        ce.y = 15;
        System.out.println(ce.x + ce.y);
    }
}