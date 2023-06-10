import java.util.Scanner;

public class Function_1 {

    // function
    public static void printName(String name) {
        System.out.println("You enterd : " + name);
        return;
    }

    // Main funtion
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // here sc is object.

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        printName(name); // calling function.

        sc.close();
    }
}
