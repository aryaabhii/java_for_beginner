import java.util.Scanner;

// Prg for complex number using Coplex class.....
// 9.) WAP to create a class complex to store & display two complex number.

class Complex {
    private int real, imaginary;

    void input(int r, int i) {
        real = r;
        imaginary = i;
    }

    void display() {
        System.out.println("Enterd real number      : " + real);
        System.out.println("Enterd imaginary number : " + imaginary);
    }

    void getComplex() {
        System.out.println("Real Number      : " + "+" + real);
        System.out.println("Imiginary Number : " + "i" + imaginary);
    }
}

class ClassComplex {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter real number      : ");
        int r = obj.nextInt();
        System.out.print("Enter imaginary number : ");
        int i = obj.nextInt();
        Complex c = new Complex();
        c.input(r, i);
        c.display();
        c.getComplex();
        obj.close();
    }
}