class Students {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {

    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}
// Polymorphism : It is made using two words POLY & MORPHISM.
// Poly means : Many
// Morphism means : Forms.

// We can define polymorphism :
// when we peroform different work using same method is called polymorphism.

// Types of polymorphism.
// 1.) Function overloading.
// ______1.) compile-time polymorphism.
// ______2.) runtime polymorphism.
// 2.) Function overriding.

public class OopsPolymorphism {
    public static void main(String args[]) {
        Students std1 = new Students();

        std1.name = "Abhijeet";
        std1.age = 20;

        std1.printInfo(std1.name, std1.age);
    }
}