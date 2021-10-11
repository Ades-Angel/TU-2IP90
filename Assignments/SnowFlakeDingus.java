/**
 * CircleDingus -- part of HA RandomArtist
 * example of a very simple Dingus
 * @author Dominika Chabior 1700219 kees
 * @author Chloe Antonozzi 1670980 huub
 */

import java.awt.Graphics;

public class SnowFlakeDingus extends Dingus {
    protected boolean filled; //true: filled, false: outline
    protected int x,y, posX, posY;

    public SnowFlakeDingus(int maxX, int maxY){
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
                x = posX + (int)(75 * Math.cos(i * Math.PI/180));
                y = posY + (int)(75 * Math.sin(i * Math.PI/180));
                g.fillOval(x-10, y-10, 20,20);
                g.drawLine(posX, posY, x,y);
            }
        }

    }
}
