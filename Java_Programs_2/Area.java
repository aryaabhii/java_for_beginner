
// Calculation Apk.
import java.util.*;

class Area {
    public static void main(String[] args) {
        int lenght, width, area;
        Scanner ss = new Scanner(System.in);
        System.out.println("This Java program is for finding area of Rectangle :");
        System.out.println("Enter Length of Rectangle : ");
        lenght = ss.nextInt();
        System.out.println("Enter Width of Rectangle : ");
        width = ss.nextInt();
        ss.close();
        area = lenght * width;
        System.out.println("Area of rectangle = " + area);
    }
}
