class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Copy constructor.
    Student(Student std2) {
        this.name = std2.name;
        this.age = std2.age;
    }

    // when we using copy constructor then we hav eto create non-paramitirsed
    // constructor bcz now we creating this forcefully so compiler do not create
    // automatically so we need to craete this.
    Student() {
    }
}

// run test case need to download.

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

public class OopsConstructor_3 {
    public static void main(String args[]) {
        Student std1 = new Student();

        std1.name = "Abhijeet";
        std1.age = 20;

        Student std2 = new Student(std1);

        std2.printInfo();
    }
}