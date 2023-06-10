
//Prg to taking string as input
import java.util.*;

class ExampleString {
    public static void main(String args[]) {
        String str;
        System.out.println("Enter a string : ");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        System.out.print("String is : " + str);
        s.close();
    }
}
