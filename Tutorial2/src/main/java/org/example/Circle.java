package org.example;

import java.awt.*;

public class Circle extends Canvas {
    private int radius;
    private Point coordinates;
    private Color colour;

    public Circle(int val1, Point val2, Color val3){
        this.radius =  val1;
        this.coordinates = val2;
        this.colour = val3;
    }

    public void draw(Graphics g){
        g.setColor(colour);
        g.fillOval(coordinates.x, coordinates.y, radius, radius);
        // you need to figure out how to unpack coord into 2 ints
    }
}
