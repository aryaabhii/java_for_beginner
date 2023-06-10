
// Prg to print the details of an emlpoyee using class...
// /8.) WAP a prg to create a class employee having data member name, id, add & salary. Take appropriate member function to store and display the details of three employees.
import java.util.*;

class Employee {
    String name;
    int id;
    String address;
    String desginination;
    String department;
    int salary;

    void getDetails() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Employee name         :  ");
        name = obj.nextLine();
        System.out.println("Enter Employee Id           :  ");
        id = obj.nextInt();
        System.out.println("Enter Employee address      :  ");
        obj = new Scanner(System.in);
        address = obj.nextLine();
        System.out.println("Enter Employee desginination : ");
        desginination = obj.nextLine();
        System.out.println("Enter Employee department    : ");
        department = obj.nextLine();
        System.out.println("Enter Employee salary        : ");
        salary = obj.nextInt();
    }

    void putDetails() {
        System.out.println("Hello!" + name);
        System.out.println("Your id is " + id);
        System.out.println("Your rsidence is " + address);
        System.out.println("Your job profile is " + desginination);
        System.out.println("Your Department is" + department);
        System.out.println("Your Salary is " + salary);
    }
}

class ClassEmployee {
    public static void main(String args[]) {
        Employee e[] = new Employee[5];
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee();
        }
        System.out.println("Enter details of " + e.length + " Employee : ");
        for (int i = 0; i < e.length; i++) {
            e[i].getDetails();
        }
        System.out.println("Details of all employees are :");
        for (int i = 0; i < e.length; i++) {
            e[i].putDetails();
        }
    }
}
