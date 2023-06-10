
//  program to create to pass primitive types .
//  call by value behaviour in JAVA.....
import java.util.*;

class PassingOfArrayIn_1__Array_Example_3 {
    void sum(int num) {
        num = num + 100;
    }

    public static void main(String args[]) {
        PassingOfArrayIn_1__Array_Example_3 obj = new PassingOfArrayIn_1__Array_Example_3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number    : ");
        int num = sc.nextInt();
        System.out.println("Number before sum : " + num);
        obj.sum(num);
        System.out.println("Number after sum  : " + num);
        sc.close();
    }
}