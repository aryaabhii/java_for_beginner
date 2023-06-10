import java.util.Scanner;

public class Function_2 {
    // Sum funtion.
    public static int calculateSum(int first, int second) {
        int sum = first + second;
        return sum; // returning sum after calculation.
    }

    // main function.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // scanner object

        // inputting number.
        System.out.print("Enter first number  : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();

        int sum = calculateSum(first, second); // calling function.
        System.out.print("Sum : " + sum); // prinitng the sum.

        sc.close();

    }

}
