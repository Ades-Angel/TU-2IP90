/**
 * CircleDingus -- part of HA RandomArtist
 * example of a very simple Dingus
 * @author Dominika Chabior 1700219 kees
 * @author Chloe Antonozzi 1670980 huub
 */

import java.awt.Graphics;
import java.awt.Font;

class DomiDingus extends Dingus {
    protected int x;
    protected int y;
    protected boolean filled; //true: filled, false: outline

    public DomiDingus (int maxX, int maxY){
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
            g.drawString("Domi", x, y);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        }else{
            g.drawString("Domi", x, y);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        }
    }
}
