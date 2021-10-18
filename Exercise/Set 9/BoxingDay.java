
/*
Chloe Antonozzi
1670980

17/10/2021
Uses nested panels
*/
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

class BoxingDay {
    JFrame frame;
    JPanel mainPanel, panel, panel2;
    JLabel label1, label2, label3, label4;

    BoxingDay() {
        frame = new JFrame("Boxing Day");
        mainPanel = new JPanel();
        panel = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel("Ik zou je het liefste");
        label2 = new JLabel("in een");
        label3 = new JLabel("willen doen");
        label4 = new JLabel("doosje");
    }

    void setUpGui() {
        frame.setSize(500, 300);

        label1.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        panel2.setBackground(new Color(0, 196, 255));
        panel2.setBorder(new LineBorder(Color.RED, 1));
        panel2.add(label4, BorderLayout.CENTER);

        panel.setBackground(Color.YELLOW);
        panel.setBorder(new LineBorder(Color.BLACK, 1));
        panel.add(label2, BorderLayout.CENTER);
        panel.add(panel2, BorderLayout.CENTER);
        panel.add(label3, BorderLayout.CENTER);

        mainPanel.setBackground(Color.PINK);
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5));
        mainPanel.add(label1, BorderLayout.CENTER);
        mainPanel.add(panel, BorderLayout.CENTER);

        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        BoxingDay bd = new BoxingDay();
        bd.setUpGui();
    }
}
