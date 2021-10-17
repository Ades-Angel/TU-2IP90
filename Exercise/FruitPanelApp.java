
/**
 * Chloe Antonozzi
 * 1670980
 * 
 * 17/10/2021
 */
import javax.swing.*;
import java.awt.*;

class FruitPanelApp {
    JFrame frame;
    FruitPanel fruitPanel;

    void buildGUI() {
        frame = new JFrame("Gezondheidsadvies");
        fruitPanel = new FruitPanel();
        fruitPanel.setBackground(Color.white);
        frame.add(fruitPanel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        (new FruitPanelApp()).buildGUI();
    }
}

class FruitPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.orange);
        g.fillOval(40, 20, 50, 50);

        g.setColor(Color.red);
        g.fillOval(100, 40, 30, 30);

        g.setColor(Color.yellow);
        g.fillOval(140, 20, 40, 50);
        g.setColor(Color.white);
        g.fillOval(145, 15, 30, 40);

        g.setColor(new Color(139, 69, 19));
        g.fillRect(20, 70, 200, 25);
        g.fillRect(20, 85, 20, 50);
        g.fillRect(200, 85, 20, 50);

        g.setColor(Color.blue);
        g.drawString("Eet meer Freud, dan bleibt u Jung!", 40, 15);
    }
}
