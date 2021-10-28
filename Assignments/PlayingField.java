
/**
 * Assignment 6 -- Prisoner's Dilemma -- 2IP90
 * part PlayingField
 * 
 * @author Dominika Chabior 1700219
 * @author Chloe Antonozi 1670980
 * assignment group 110
 * 
 * assignement copyright Kees Huizing
 */

import java.awt.*;
import java.util.Random; 
import javax.swing.JPanel;

class PlayingField extends JPanel{
    private int gridLength = 45;
    private int gridHeight = 45;
    private Patch[][] grid = new Patch[gridLength][gridHeight];
    private double alpha = 1;
    private boolean extraRule = false;

    private static final long SEED = 37L;
    public static final Random random = new Random(SEED);

    public void step(){
        for(int x =0; x < gridLength; x++){
            for(int y = 0; y < gridHeight; y++){
                if(grid[x][y].getJustChanged()){
                    if(grid[x][y].isCooperating()){
                        grid[x][y].setBackground(Color.blue);
                    }else{
                        grid[x][y].setBackground(Color.red);
                    }
                }
            }
        }

        for (int x = 0; x < gridLength; x++){
            for (int y = 0; y < gridHeight; y++){
                grid[x][y].resetScore();
            }
        }

        calculate();

        for (int x = 0; x < gridLength; x++){
            for (int y = 0; y < gridHeight; y++){
                strategy(x,y);
            }
        }

        for (int x = 0; x < gridLength; x++){
            for (int y = 0; y < gridHeight; y++){
                if(grid[x][y].getChangeStrategy()){
                    grid[x][y].toggleStrategy();
                    grid[x][y].setChangeStrategy(false);
                }
            }
        }
    }

    private void strategy(int x, int y){
        double highestScore = 0;
        Patch highestPatch = grid[x][y];

        for (Patch neighbour : grid[x][y].neighbours){
            if (neighbour.getScore() == highestScore && extraRule){
                highestPatch = neighbour;
            }else if (neighbour.getScore() == highestScore){
                if (random.nextBoolean()){
                    highestPatch = neighbour;
                }
            }

            if (neighbour.getScore() > highestScore){
                highestScore = neighbour.getScore();
                highestPatch = neighbour;
            }
        }

        if (grid[x][y].isCooperating() != highestPatch.isCooperating()){
            grid[x][y].setChangeStrategy(true);
        }else{
            grid[x][y].setChangeStrategy(false);
        }
    }

    private void add(int row, int col){
        int rowx;
        int rowy;
        int i = 0;

        for (int x = row-1; x<=row+1; x++){
            for (int y = col-1; y<=col+1; y++){
                rowx = x;
                rowy = y;

                if(x < 0){
                    rowx = gridLength - 1;
                }

                if (y < 0){
                    rowy = gridHeight - 1;
                }

                if ( x >= gridLength){
                    rowx = 0;
                }

                if (y >= gridHeight){
                    rowy = 0;
                }

                grid[row][col].neighbours[i] = grid[rowx][rowy];
                i++;
            }
        }
    }

    public void fillPatch(){
        for (int x =0; x < gridHeight; x++){
            for(int y =0; y < gridLength; y++){
                grid[x][y] = new Patch();
            }
        }
    }

    public void Neighbours(){
        for(int x = 0; x < gridLength; x++){
            for (int y = 0; y < gridHeight; y++){
                add(x,y);
            }
        }
    }

    public int getGridLength(){
        return this.gridLength;
    }

    public Patch getPatch(int x, int y){
        return grid[x][y];
    }

    public void setAlpha(double alpha){
        this.alpha = alpha;
    }

    public double getAlpha(){
        return this.alpha;
    }

    public void generatePatch(){
        for(int x =0; x < gridLength; x++){
            for (int y =0; y < gridHeight; y++){
                grid[x][y].setCooperating(random.nextBoolean());
            }
        }
    }

    public boolean[][] getGrid(){
        boolean[][] resultGrid = new boolean[grid.length][grid[0].length];

        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[0].length; y++){
                resultGrid[x][y] = grid[x][y].isCooperating();
            }
        }
        return resultGrid;
    }

    public void setGrid(boolean[][] inGrid){
        for (int x =0; x < inGrid.length; x++){
            for (int y =0; y < inGrid[0].length;y++){
                grid[x][y].setCooperating(inGrid[x][y]);
            }
        }
    }

    public void setExtraRule(boolean x){
        this.extraRule = x;
    }

    public boolean getExtraRule(){
        return this.extraRule;
    }

    private void calculate(){
        for(int x = 0; x < gridLength; x++){
            for (int y = 0; y < gridHeight; y++){
                if (grid[x][y].isCooperating()){
                    for(Patch neighbour : grid[x][y].neighbours){
                        if (neighbour.isCooperating() && (neighbour != grid[x][y])){
                            grid[x][y].scoreAdd(1.0);
                        }
                    }
                }else{
                    for(Patch neighbour : grid[x][y].neighbours){
                        if (neighbour.isCooperating() && (neighbour != grid[x][y])){
                            grid[x][y].scoreAdd(alpha);
                        }
                    }
                }
            }
        }
    }

    public int getGridHeight(){
        return this.gridHeight;
    }


}
