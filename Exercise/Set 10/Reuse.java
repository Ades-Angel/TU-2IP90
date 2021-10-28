/*
Chloe Antonozzi
1670980

17/10/2021
*/
import java.util.ArrayList;

public class Reuse extends ArrayList<Double> {
    @Override
    boolean add(int index, double e){
        ArrayList[index] = e;
        return true;
    }
}
