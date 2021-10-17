/*
Chloe Antonozzi
1670980

17/10/2021
*/
import javax.swing.*;
import java.awt.*;

class FlyingColors {
    JFrame frame;
    JLabel label,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JPanel panel;

    FlyingColors(){
        frame = new JFrame("Flying Colors");

        label = new JLabel("What's my background color?");
        l1 = new JLabel("");
        l2 = new JLabel("");
        l3 = new JLabel("");
        l4 = new JLabel("");
        l5 = new JLabel("");
        l6 = new JLabel(" ");
        l7 = new JLabel(" ");
        l8 = new JLabel(" ");
        l9 = new JLabel(" ");
        l10 = new JLabel(" ");


        panel = new JPanel();
        panel.setLayout(new GridLayout(10,8));
    }

    void setUpGui(){
        frame.setSize(800,600);

        label.setBackground(Color.PINK);
        label.setOpaque(true);

        l1.setBackground(new Color(255,0,0));
        l2.setBackground(new Color(255,80,80));
        l3.setBackground(new Color(255,100,100));
        l4.setBackground(new Color(255,130,130));
        l5.setBackground(new Color(255,140,140));
        l6.setBackground(new Color(255,150,150));
        l7.setBackground(new Color(255,160,160));
        l8.setBackground(new Color(255,180,180));
        l9.setBackground(new Color(255,200,200));
        l10.setBackground(new Color(255,225,225));
        
        l1.setOpaque(true);
        l2.setOpaque(true);
        l3.setOpaque(true);
        l4.setOpaque(true);
        l5.setOpaque(true);
        l6.setOpaque(true);
        l7.setOpaque(true);
        l8.setOpaque(true);
        l9.setOpaque(true);
        l10.setOpaque(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.add(l1,0,0);
        panel.add(l2,0,1);
        panel.add(l3,0,2);
        panel.add(l4,0,3);
        panel.add(l5,0,4);
        panel.add(l6,0,5);
        panel.add(l7,0,6);
        panel.add(l8,0,7);
        panel.add(l9,0,8);
        panel.add(l10,0,9);

        frame.add(label, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
    }
    public static void main(String[] args){
        FlyingColors fc = new FlyingColors();
        fc.setUpGui();
    }
}
