class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // non - parametrised constructor.
    Student() {
        System.out.println("Constructor called.");
    }

}

// In java contructors are used to create objects.

// Three types of constructors in java.
// 1.) Non - Parametrized constructor.
// 2.) Parametrized constructor.
// 3.) Copy constructor.

// Properties of constructor.
// The name of constructors and class well be same.
// Constructor could not return anythings.
// Only one object constructor can be called at a time.

// If we not create a constructor then it will construct automatically in non -
// parametrised constructor,.

public class OopsConstructor_1 {
    public static void main(String args[]) {
        Student std1 = new Student();
        std1.name = "Abhijeet";
        std1.age = 20;

        std1.printInfo();
    }
}