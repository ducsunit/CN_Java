package com.ducsunit.swing;

import javax.swing.*;
import java.awt.*;

public class Demo_Swing {
    public static void main(String[] args) {
        // khởi tạo đói tượng
        JFrame frame = new JFrame();
        // set tiêu đề
        frame.setTitle("Demo Swing");
        // set kích thước
        frame.setSize(300, 300);
//        frame.setLocation(550,250);
        // set vị trí hiển thị giữa màn hình
        frame.setLocationRelativeTo(null);
        // Set background color
        frame.getContentPane().setBackground(Color.GREEN); // Example: green color
        // set cho hiển thị cửa sổ
        frame.setVisible(true);

        // xử lý đóng frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
