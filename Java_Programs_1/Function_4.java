import java.util.Scanner;

class Function_4 {
    // factorial function.
    public static void printFactorial(int num) {
        int factorial = 1;
        if (num < 0) {
            System.out.println("Invalid! number.");
            return;
        }
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i; // calculating factorial.
        }
        System.out.println("Factorial : " + factorial); // printing factrial.
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        printFactorial(num);
        sc.close();
    }
}
