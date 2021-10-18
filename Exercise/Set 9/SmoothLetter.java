/*
Chloe Antonozzi
1670980

17/10/2021
Extenstion to the file Letter
*/
import Homework.Set7.Letter;

public class SmoothLetter extends Letter {
    double deltaX = 2;
    double interval = 0.1;

    public SmoothLetter(String letter) {
        super(letter);
    }

    void aap() {
    }

    @Override
    public void moveRel(int x, int y) {
        int step = 1;
        if (x != 0) {
            step = (int) (x / deltaX);
        }
        double deltaY = y / step;

        for (int i = 0; i < step; i++) {
            super.moveRel((int) deltaX, (int) deltaY);
            pauseInSec(interval);
        }
        System.out.println("This is moveRel from the SmoothLetter.");
        super.moveRel(x, y);
    }

    public static void main(String[] args) {
        SmoothLetter q = new SmoothLetter("Q");
        q.moveRel(100, 100);
        q.moveDown();
    }
}
