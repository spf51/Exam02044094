package org.example;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame1 extends Frame {
    Frame1() {
        Button b = new Button("Click");
        b.setBounds(200,50,80,30);
        add(b);
        setTitle("Basic example");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }
}
