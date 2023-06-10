
// Example of applet
import java.applet.*;
import java.awt.*;

/*
 *  java.lang ->  java.awt.component  ->  java.util.container  ->  java.awt.panel  -> java.applet.applet 
 */
public class MyApplets_2 extends Applet {
    int f, s, r;

    public void start() {
        r = f + s;
    }

    public void init() {
        f = Integer.parseInt(getParameter("first"));
        s = Integer.parseInt(getParameter("second"));
    }

    public void paint(Graphics g) {
        g.drawString("First Number  : " + String.valueOf(f), 200, 370);
        g.drawString("Second Number : " + String.valueOf(s), 200, 390);
        g.drawString("Sum of " + String.valueOf(f) + " + " + String.valueOf(s) + " = " + String.valueOf(r), 200, 410);
    }
}
