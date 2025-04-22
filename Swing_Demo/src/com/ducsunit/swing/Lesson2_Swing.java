package com.ducsunit.swing;

import javax.swing.*;

public class Lesson2_Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.add(panel);

        JLabel label = new JLabel();
        JButton button = new JButton();
        label.setText("Lesson 2 Swing");
        button.setText("Click");
        panel.add(label);
        panel.add(button);


        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
