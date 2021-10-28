/*
Chloe Antonozzi
1670980

28/10/2021
*/
import java.util.Scanner;

public class Columnism {
    Scanner scan = new Scanner(System.in);

    int row = scan.nextInt();
    int col = scan.nextInt();
    int[][] spreadsheet = new int[row][col];

    public void columnism() {
        // Sets up the array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int input = scan.nextInt();
                spreadsheet[i][j] = input;
            }
        }
        // calculates last row
        for (int x = row - 1; x > 0; x--) {
            for (int y = col - 1; y >= 0; y--) {
                int n = spreadsheet[x][y];
                int m = spreadsheet[x - 1][y];
                spreadsheet[spreadsheet.length - 1][y] = m + n;
            }
        }
        System.out.println();

        for (int v = 0; v < row; v++) {
            for (int w = 0; w < col; w++) {
                System.out.printf("%4d", spreadsheet[v][w]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        (new Columnism()).columnism();
    }
}
