
package MyNewPack;

// example of package.
public class SumPackage {
    public void display() {
        System.out.println("Welcome to package second tutorial...");
        System.out.println("Sum : " + (50 + 20));
    }

    public static void main(String args[]) {
        SumPackage sp = new SumPackage();
        sp.display();
    }
}