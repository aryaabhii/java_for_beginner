
// Program to print greatest number among three imputed number using ternery opertator.
import java.util.Scanner;

class Greatest_Number_Among_Three {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter First Number : ");
        num1 = s.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = s.nextInt();
        System.out.println("Enter Three Number : ");
        num3 = s.nextInt();
        int result = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println(result + " is greatest.");
        s.close();
    }
}