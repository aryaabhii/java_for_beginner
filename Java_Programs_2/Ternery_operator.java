
// Program to find greatest one between tweo number using ternery operator.
import java.util.Scanner;

class Ternery_Operator {
    public static void main(String args[]) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        num1 = s.nextInt();
        System.out.println("Enter second number : ");
        num2 = s.nextInt();
        // (num1 > num2)?System.out.println((num1 + " is greatest number."));
        // System.out.println((num1 + " is greatest number."));
        // ABOVE CODES GIVES ERROR BECAUSE IT IS NOT THE BEST APPROACH IN JAVA

        /**
         * ....BELOW THE TWO METHOD WHICH WE CAN FOLLLOW IN JAVA.........
         */
        System.out.println((num1 > num2) ? num1 + " is greater" : num2 + " is greater");

        int r = (num1 > num2) ? num1 : num2;
        System.out.println(r + " is greater.");
        s.close();
    }
}