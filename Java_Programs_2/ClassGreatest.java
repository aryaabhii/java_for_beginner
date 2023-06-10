
// Prg to check the greatest number using Greatest class.........
// 5.) WAP to create a class great to print the greatest number among three number.
import java.util.Scanner;

class Greatest {
    private int first, second, third;

    void input(int f, int s, int t) {
        first = f;
        second = s;
        third = t;
    }

    void display() {
        System.out.println("First Number  : " + first);
        System.out.println("Second Number : " + second);
        System.out.println("Third Number  : " + third);
    }

    public void getGreatest() {
        if (first > second)
            if (first > third) {
                System.out.println(first + " is greatest number....");
            } else {
                System.out.println(third + " is greatest number....");
            }
        else if (second > third) {
            System.out.println(second + " is greatest number....");
        } else {
            System.out.println(third + " is greatest number....");
        }
    }
}

class ClassGreatest {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        int f = obj.nextInt();
        System.out.print("Enter Second number : ");
        int s = obj.nextInt();
        System.out.print("Enter third number  : ");
        int t = obj.nextInt();
        Greatest g = new Greatest();
        g.input(f, s, t);
        g.display();
        g.getGreatest();
        obj.close();
    }
}
