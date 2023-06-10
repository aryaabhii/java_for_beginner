class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something.");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }

}

public class Oops_1 {
    public static void main(String args[]) {
        Pen pen1 = new Pen(); // object for class.
        Pen pen2 = new Pen();

        // for obj1
        pen1.color = "Red";
        pen1.type = "Gel";

        // for obj2
        pen2.color = "Blue";
        pen2.type = "Ball";

        pen1.write();

        pen1.printColor();

        pen2.printType();
    }
}