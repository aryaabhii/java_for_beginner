import java.util.Scanner;

public class Function_3 {
    // multiplication function.
    public static int calculateProduct(int first, int second) {
        int product = first * second;
        return product;
    }

    // main function.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number :");
        int second = sc.nextInt();

        System.out.println("Prodcut  : " + calculateProduct(first, second));

        sc.close();

    }
}
