/**
 * ChloeDingus -- part of HA RandomArtist
 * @author Dominika Chabior 1700219
 * @author Chloe Antonozzi 1670980 
 */

import java.awt.Graphics;
import java.awt.Font;

class ChloeDingus extends Dingus {
    protected int x;
    protected int y;
    protected boolean filled; //true: filled, false: outline

    public ChloeDingus (int maxX, int maxY){
        // intialize randomly the Dingus properties, i.e., position and color
        super(maxX, maxY);
        // initialize randomly the CircleDingus properties, i.e., x,y and filledness
        x = random.nextInt(700);
        y = random.nextInt(400);
        filled = random.nextBoolean();


    }
      
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        if (filled){
            g.drawString("Chloe", x, y);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        }else{
            g.drawString("Chloe", x, y);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        }
    }
}
