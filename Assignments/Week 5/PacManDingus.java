/**
 * PacManDingus -- part of HA RandomArtist
 * @author Dominika Chabior 1700219
 * @author Chloe Antonozzi 1670980
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
