import java.util.Scanner;

class Student {
    String name;
    int age;

    public void printName() {
        System.out.println("Name : " + this.name);
    }

    public void printAge() {
        System.out.println("Age : " + this.age);
    }
}

public class Oops_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Student std1 = new Student();

        // data

        System.out.print("Enter name : ");
        std1.name = sc.nextLine();

        System.out.print("Enter age : ");
        std1.age = sc.nextInt();

        // call
        std1.printName();
        std1.printAge();

        sc.close();
    }
}