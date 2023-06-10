
// Example of applet
import java.applet.*;
import java.awt.*;

/*
 *  java.lang ->  java.awt.component  ->  java.util.container  ->  java.awt.panel  -> java.applet.applet 
 */
public class MyApplets_1 extends Applet {
    String mesaage = " ";
    int x, y, r;
    String message;

    public void start() {
        message += "There....";
        r = x + y;
    }

    public void init() {
        message += "Hi!,";
        x = 50;
        y = 20;
    }

    public void paint(Graphics g) {
        g.drawString(message, 200, 330);
        g.drawString("Hello!, Welcome to Java", 200, 350);
        g.drawString("First Number  : " + String.valueOf(x), 200, 370);
        g.drawString("Second Number : " + String.valueOf(y), 200, 390);
        g.drawString("Sum of " + String.valueOf(x) + " + " + String.valueOf(y) + " = " + String.valueOf(r), 200, 410);
    }
}
