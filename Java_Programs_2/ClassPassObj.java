
// Prg to pass the object.....
import java.util.Scanner;

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

    void addComplex(Complex c) {
        real = real + c.real;
        imaginary = imaginary + c.imaginary;
    }
}

class ClassPassObj {
    public static void main(String args[]) {
        Complex cc1 = new Complex();
        Complex cc2 = new Complex();
        System.out.println("Enter value for cc1 : ");
        cc1.getData();
        System.out.println("Enter value for cc2 : ");
        cc2.getData();
        System.out.println("Enterd value for cc1 : ");
        cc1.putData();
        System.out.println("Enterd value for cc2 : ");
        cc2.putData();
        cc1.addComplex(cc2);
        System.out.println("Value after Addition : ");
        cc1.putData();
    }
}