/**
 * CircleDingus -- part of HA RandomArtist
 * example of a very simple Dingus
 * @author Dominika Chabior 1700219 kees
 * @author Chloe Antonozzi 1670980 huub
 */

import java.awt.Graphics;

class PacManDingus extends Dingus {
    protected int radius;
    protected boolean filled; //true: filled, false: outline

    public PacManDingus(int maxX, int maxY) {
        // intialize randomly the Dingus properties, i.e., position and color
        super(maxX, maxY);
        // initialize randomly the CircleDingus properties, i.e., radius and filledness
        radius = random.nextInt(100);
        filled = random.nextBoolean();
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if (filled){
            g.fillArc(x, y, radius, radius,0, 300);
        }else{
            g.fillArc(x, y, radius, radius,0, 300);
        }
    }
}
