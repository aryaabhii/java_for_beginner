
//  non static method specified in different class from main() method......
import java.util.*;

class SumUsingFunction {
    void sum(int f, int s) {
        System.out.println("Sum of        " + f + " + " + s + " : " + (f + s));
        System.out.println("Difference of " + f + " - " + s + " : " + (f - s));
        System.out.println("Product of    " + f + " + " + s + " : " + (f * s));
    }

    public static void main(String args[]) {
        int first, second;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        SumUsingFunction s = new SumUsingFunction(); // here obj for class
        s.sum(first, second);
        sc.close();
    }
}
