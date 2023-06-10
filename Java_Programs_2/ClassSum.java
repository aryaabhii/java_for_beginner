
// Prg to create a sum class and perform addition......
// 1.) WAP in JAVA to create a class sum to print the sum of two numbers. 
import java.util.*;

class Sum {
    private int first, second;

    void input(int f, int s) {
        first = f;
        second = s;
    }

    void display() {
        System.out.println("First number : " + first);
        System.out.println("Second number : " + second);
    }

    public void sum() {
        System.out.print("Sum of " + first + " + " + second + " = " + (first + second));
    }
}

class ClassSum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int f = obj.nextInt();
        System.out.print("Enter Second Number : ");
        int s = obj.nextInt();
        Sum sm = new Sum();
        sm.input(f, s);
        sm.display();
        sm.sum();
        obj.close();
    }
}
