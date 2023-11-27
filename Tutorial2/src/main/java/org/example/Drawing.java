package org.example;
import java.awt.*;
public class Drawing extends Canvas {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(0,0,100,100);
        c.draw(g);

    }

   private Circle c;
    public Drawing(){
        c = new Circle(100, new Point(10,10), Color.green);
    }
}
