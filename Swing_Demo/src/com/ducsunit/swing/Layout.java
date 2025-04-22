package com.ducsunit.swing;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class Layout {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Demo BorderLayout");
        frame.setSize(300, 300);

        JButton button1 = new JButton("NORTH");
        JButton button2 = new JButton("SOUTH");
        JButton button3 = new JButton("WEST");
        JButton button4 = new JButton("EAST");
        JButton button5 = new JButton("CENTER");

        button1.setBackground(Color.GREEN);
        button2.setBackground(Color.RED);
        button3.setBackground(Color.YELLOW);
        button4.setBackground(Color.CYAN);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(button1, BorderLayout.NORTH);
        panel.add(button2, BorderLayout.SOUTH);
        panel.add(button3, BorderLayout.WEST);
        panel.add(button4, BorderLayout.EAST);
        panel.add(button5, BorderLayout.CENTER);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
