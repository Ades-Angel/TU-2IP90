/*
Chloe Antonozzi
1670980

28/10/2021
*/
import java.util.Scanner;

public class PieceOfCake {

    public void output() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double piApprox = pi(n + 1);
        System.out.println(piApprox);
    }

    public double pi(double n) {
        double pi = 0;
        int counter = 0;
        for (int i = 1; i < n; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
            counter++;
        }
        return 4 * pi;
    }

    public static void main(String[] args) {
        (new PieceOfCake()).output();
    }
}
