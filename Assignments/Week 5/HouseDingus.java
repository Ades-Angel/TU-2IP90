/**
 * HouseDingus -- part of HA RandomArtist
 * @author Dominika Chabior 1700219 
 * @author Chloe Antonozzi 1670980 
 */

import java.awt.Graphics;

public class HouseDingus extends Dingus {
    private int height;
    private int width;
    int ax,ay;
    private int [] x = new int[3];
    private int [] y = new int[3] ;
    protected boolean filled; //true: filled, false: outline
    
    public HouseDingus(int maxX, int maxY){
        // intialize randomly the Dingus properties, i.e., position and color
        super(maxX, maxY);

        // initialize randomly the HouseDingus properties, i.e., height and filledness
        height = random.nextInt(maxX/4);
        width = random.nextInt(maxY/4);
        ax = random.nextInt(700);
        int bx = ax + width;
        int cx = ax + width/2;
        ay = random.nextInt(300);
        int by = ay;
        int cy = ay - height;

        x[0] = ax;
        x[1] = bx;
        x[2] = cx;
        y[0] = ay;
        y[1] = by;
        y[2] = cy;

        filled = random.nextBoolean();
    }

    @Override
    void draw(Graphics g){
        //draw roof
        g.setColor(color);
        if (filled){
            g.drawPolygon(x, y, 3);
        }else{
            g.drawPolygon(x, y, 3);
        }

        g.setColor(color);
        if (filled){
            g.fillRect(ax, ay, width, width);
        }else{
            g.drawRect(ax, ay, width, width);
        }
        
    }

}
