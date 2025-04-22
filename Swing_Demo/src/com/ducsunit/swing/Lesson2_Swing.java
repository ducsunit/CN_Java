package com.ducsunit.swing;

import javax.swing.*;
import java.awt.*;

public class Lesson2_Swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        // set size
        frame.setSize(300, 300);
        // panel
        panel.setLayout(new FlowLayout());
        //set size Panel
        panel.setSize(new Dimension(300, 300));

        // label
        JLabel label = new JLabel("Lesson 2 Swing");
        panel.add(label);

        //JMenuBar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setSize(100, 300);
        // create JMenu add JMenuBar
        JMenu fileMenu = new JMenu("File", false);
        JMenu newMenu = new JMenu("Open", false);
        JMenu editMenu = new JMenu("Edit", false);
        JMenu saveMenu = new JMenu("Save", false);
        JMenu helpMenu = new JMenu("Help", false);
        JMenu exitMenu = new JMenu("Exit", false);
        menuBar.add(fileMenu);
        menuBar.add(newMenu);
        menuBar.add(helpMenu);
        menuBar.add(saveMenu);
        menuBar.add(helpMenu);
        menuBar.add(exitMenu);
        // create JMenuItem add JMenu
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.addSeparator();

        // create sub menu
        JMenu softwarehelpMenu = new JMenu("Software Help");
        helpMenu.add(softwarehelpMenu);
        softwarehelpMenu.add(new JMenuItem("UNIX"));
        softwarehelpMenu.add(new JMenuItem("WindowXP"));
        // menu item
        helpMenu.add(new JMenuItem("Message"));
        helpMenu.add(new JMenuItem("Call"));
        helpMenu.addSeparator();

        panel.add(menuBar);

        //JTextField
        JTextField textField = new JTextField(10);
        panel.add(textField);

        JButton button = new JButton("Search");
        panel.add(button);
        button.setBackground(Color.GREEN);

        // JTable
        String[][] data = {{"101", "Alex", "9900"}, {"102", "Bob", "8800"}, {"103", "Cindy", "7700"}};
        String[] column = {"ID", "Name", "Salary"};
        JTable table = new JTable(data, column);
        table.setBounds(10, 10, 280, 280);
        panel.add(table);

        // JComboBox
        String[] country = {"Vietnam", "China", "Japan", "Korea"};
        JComboBox comboBox = new JComboBox(country);
        panel.add(comboBox);
        // display center screen
        frame.setLocationRelativeTo(null);

        // set display frame
        frame.setVisible(true);
        // handle close frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
