
// Homework Assignement 3 2ip90
/**
 * @author Chloe Antonozzi
 * 1670980
 * @author Dominika Chabior
 * 1700219
 */
import java.util.*;

public class Cellulitis {
    Scanner scanner = new Scanner(System.in);

    int l; // The length of row of cells (columns)
    int g; // The number of generations (rows)
    boolean[][] table; // 2D array set to false as default

    void inputGL() {
        l = scanner.nextInt();
        g = scanner.nextInt();
        table = new boolean[g + 1][l + 3];

        scanner.next();// User input init_start

        int num;
        while (scanner.hasNextInt()) { // Asks for input until the input is not a integer
            num = scanner.nextInt();
            if (num > l) {
                break;// Ingnores input greater than l
            }
            table[g - 1][num] = true; // Changes value of cell to true
        }
        scanner.next(); // User input init_end
    }

    void A() { // Code for automata A
        inputGL(); // Input for g and l
        for (int j = g - 1; j >= 1; j--) { // Loop for rows
            for (int i = 1; i < l + 1; i++) { // Loop for columns
                boolean left = table[j][i - 1];
                boolean middle = table[j][i];
                boolean right = table[j][i + 1];

                if (left == false && middle == false && right == false) {
                    table[j - 1][i] = false;
                } else if (left == true && middle == true && right == true) {
                    table[j - 1][i] = false;
                } else if (left == false && middle == true && right == false) {
                    table[j - 1][i] = false;
                } else {
                    table[j - 1][i] = true;
                }
            }
        }
    }

    void B() { // Code for automata B
        inputGL();
        for (int j = g - 1; j >= 1; j--) {
            for (int i = 1; i < l + 1; i++) {
                boolean left = table[j][i - 1];
                boolean middle = table[j][i];
                boolean right = table[j][i + 1];

                if (middle == true && right == false) {
                    table[j - 1][i] = true;
                } else if (middle == false && (left == true || right == true)) {
                    if (left == true && right == true) {
                        table[j - 1][i] = false;
                    } else {
                        table[j - 1][i] = true;
                    }
                } else {
                    table[j - 1][i] = false;
                }

            }
        }

    }

    void draw(boolean[][] generation) { // Prints out the result
        for (int j = g - 1; j >= 0; j--) {
            for (int i = 1; i < l + 1; i++) {
                if (table[j][i]) { // If the value in the 2D array is true prints out *
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    void run() {
        String automata = scanner.next(); // Asks for input A,B or U

        if (automata.equals("A")) { // Checks if the input is A,B or U
            A();
            draw(table);
        } else {
            B();
            draw(table);
        }
    }

    public static void main(String[] args) {
        (new Cellulitis()).run();
    }
}
