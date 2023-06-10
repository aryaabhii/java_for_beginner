
// Program to find greatest one between two number
import java.util.*;

class Greater_Number {
    public static void main(String args[]) {
        int num1, num2;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        num1 = ss.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = ss.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the greatest number.");
        } else {
            System.out.println(num2 + " is the greatest number.");
        }
        ss.close();
    }
}