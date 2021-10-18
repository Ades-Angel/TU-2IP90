
/*
Chloe Antonozzi
1670980

16/10/2021
Prints out a window with buttons and an image
*/
import java.awt.*;
import javax.swing.*;

class SomeComponents {
    JFrame frame;
    JLabel lbl, icon;
    JButton button, button2;
    JPanel panel, bottomPanel;
    JTextField text;
    ImageIcon image;

    SomeComponents() {
        frame = new JFrame("Some Components"); // creates frame
        lbl = new JLabel("What's \n my \n color?");
        button = new JButton("Ok"); // creates component: JButton
        button2 = new JButton("Not Ok");
        panel = new JPanel(); // creates another component
        text = new JTextField("Don't press these buttons");
        image = new ImageIcon("cat.jpg");
        icon = new JLabel(image);
        bottomPanel = new JPanel(new BorderLayout());

    }

    void buildIt() {
        frame.add(panel); // places panel in center of frame

        lbl.setBackground(Color.PINK);
        lbl.setOpaque(true);

        frame.add(button, BorderLayout.SOUTH); // places button at bottom of frame
        frame.add(button2, BorderLayout.WEST);

        Color color = new Color(255, 255, 0); // makes helper object: color yellow
        panel.setBackground(color); // color background panel

        frame.add(lbl, BorderLayout.NORTH);
        frame.add(text, BorderLayout.NORTH);

        frame.add(icon, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // closing window exits program
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SomeComponents sc = new SomeComponents();
        sc.buildIt();
    }
}
