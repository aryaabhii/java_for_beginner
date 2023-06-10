
// Prg to pass the object.....
// in this program  adding two copmlex number and storing in 3rd .
import java.util.*;

class Complex {
    private int real, imaginary;

    void getData() {
        System.out.println("Enter the value of real and imaginary : ");
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter value for Real Number      : ");
        real = obj.nextInt();
        System.out.print("Enter value for Imaginary Number : ");
        imaginary = obj.nextInt();
    }

    void putData() {
        System.out.println("Enterd real number      : " + real + "+");
        System.out.println("Enterd imaginary number : " + imaginary + "i");
    }

    void addComplex(Complex c1, Complex c2) {
        c1.real = c1.real + c2.real;
        c1.imaginary = c1.imaginary + c2.imaginary;
    }
}

class ClassPassObj3 {
    public static void main(String args[]) {
        Complex cc1 = new Complex();
        Complex cc2 = new Complex();
        Complex cc3 = new Complex();
        System.out.println("Enter value for cc1 : ");
        cc1.getData();
        System.out.println("Enter value for cc2 : ");
        cc2.getData();
        System.out.println("Enterd value for cc1 : ");
        cc1.putData();
        System.out.println("Enterd value for cc2 : ");
        cc2.putData();
        cc3.addComplex(cc1, cc2);
        System.out.println("Value after Addition : ");
        cc1.putData();
    }
}