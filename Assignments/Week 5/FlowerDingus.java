/**
 * FlowerDingus -- part of HA RandomArtist
 * @author Dominika Chabior 1700219
 * @author Chloe Antonozzi 1670980
 */

import java.awt.Graphics;

public class FlowerDingus extends Dingus {
    protected boolean filled; //true: filled, false: outline
    protected int x,y, posX, posY;

    public FlowerDingus(int maxX, int maxY){
        // intialize randomly the Dingus properties, i.e., position and color
        super(maxX, maxY);
        // initialize randomly the StarDingus properties, i.e., radius and filledness
        filled = random.nextBoolean();
        posX = random.nextInt(700);
        posY = random.nextInt(400);
        
    }

    @Override
    void draw(Graphics g){
        g.setColor(color);
        if (filled){
            for(int i = 0; i < 360; i += 30){
                x = posX + (int)(20 * Math.cos(i * Math.PI/180));
                y = posY + (int)(20 * Math.sin(i * Math.PI/180));
                g.fillOval(x-10, y-10, 20,20);
                g.drawLine(posX, posY, x,y);
            }
        }

    }
}
