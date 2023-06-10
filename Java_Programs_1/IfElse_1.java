
// If Else condition statements.....
import java.util.*;

class IfElse_1 {
    public static void main(String args[]) {
        System.out.println("Condtion statement in JAVA..");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("not adult");
        }
        sc.close();
    }
}
