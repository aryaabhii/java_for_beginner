import java.util.Scanner;

// Make a function to print the table of a given number n.
public class Function_7 {
    // function for table multiplication.
    public static void tablePrint(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (i * num));
        }
        return;
    }

    // main function.
    public static void main(String args[]) {
        // scanner object.
        Scanner sc = new Scanner(System.in);

        // inputting number from user.
        System.out.print("Which table you want : ");
        int num = sc.nextInt();

        // calling function.
        tablePrint(num);

        sc.close();

    }
}
