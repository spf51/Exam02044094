package org.example;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {
    public static void main(String[] args) {
        Frame1 frame = new Frame1();
        Drawing drawing = new Drawing();
        frame.add(drawing);
        drawing.setSize(400,400);
        drawing.setBackground(Color.WHITE);

        // if its in the frame file?
        frame.setSize(400,400);
        frame.setVisible(true);





    }
}

