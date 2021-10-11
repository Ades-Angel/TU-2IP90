/**
 *SandglassDingus -- part of HA RandomArtist
 
 * @author Dominika Chabior 1700219
 * @author Chloe Antonozzi 1670980
 */

import java.awt.Graphics;

public class SandglassDingus extends Dingus {
        protected boolean filled;
        private int height;
        private int [] x1 = new int[3];
        private int [] y1 = new int[3];
        private int [] x2 = new int[3];
        private int [] y2 = new int[3];
        int ax, ay;


    public SandglassDingus(int maxX, int maxY){

        super(maxX, maxY);

        height = random.nextInt(maxX/4);
        ax = random.nextInt(700);
        int bx = ax + height;
        int cx = ax + height/2;
        ay = random.nextInt(400);
        int by = ay;
        int cy = ay - height;

        x1[0] = ax;
        x1[1] = bx;
        x1[2] = cx;
        y1[0] = ay;
        y1[1] = by;
        y1[2] = cy;

        int dx = ax;
        int ex = bx;
        int fx = cx;
        int dy = ay - height;
        int ey = by - height;
        int fy = cy + height;


        x2[0] = dx;
        x2[1] = ex;
        x2[2] = fx;
        y2[0] = dy;
        y2[1] = ey;
        y2[2] = fy;

        

        filled = random.nextBoolean();

    }
    @Override
    void draw(Graphics g){
         g.setColor(color);
        if (filled){
            g.drawPolygon(x1, y1, 3);
            g.drawPolygon(x2, y2, 3);
        }else{
            g.fillPolygon(x1, y1, 3);
            g.fillPolygon(x2, y2, 3);

        }
    }
}
