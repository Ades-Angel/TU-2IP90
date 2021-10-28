/**
 * Assignment 6 -- Prisoner's Dilemma -- 2IP90
 * part Patch
 * 
 * @author Dominika Chabior 1700219
 * @author Chloe Antonozzi 1670980 
 * 
 * assignement copyright Kees Huizing
 */
import java.awt.*;

class Patch extends Button{
    private boolean cooperating;
    private double score;
    private boolean change;
    private boolean justChanged;
    Patch[] neighbours = new Patch[9];

    boolean isCooperating(){
        return this.cooperating;
    }

    void setCooperating(boolean coop){
        this.cooperating = coop;
        if(this.cooperating){
            this.setBackground(Color.blue);
        }else{
            this.setBackground(Color.red);
        }
    }

    void toggleStrategy(){
        if(this.isCooperating()){
            this.setBackground(Color.orange);
        }else{
            this.setBackground(Color.cyan);
        }

        this.cooperating = !cooperating;
        this.justChanged = true;
    }

    double getScore(){
        return this.score;
    }

    void scoreAdd(double score){
        this.score = this.score + score;
    }

    void resetScore(){
        this.score = 0;
    }

    void setChangeStrategy(boolean x){
        this.change = x;
    }

    boolean getChangeStrategy(){
        return this.change;
    }

    public boolean getJustChanged(){
        return this.justChanged;
    }
}
