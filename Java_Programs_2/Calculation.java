
// Calculation Apk.
import java.util.Scanner;

class Calculation {    
    public static void main(String[] args) {
        int first, second, sum, difference, product;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter first number = ");
        first = ss.nextInt();
        System.out.println("Enter second number = ");
        second = ss.nextInt();
        ss.close();
        sum = first + second;
        difference = first - second;
        product = first * second;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
    }
}
