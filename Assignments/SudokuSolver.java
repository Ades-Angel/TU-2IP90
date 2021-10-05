/**
 * Class that solves the Asterisk Sudoku. Prints the number of solutions of a
 * Sudoku if there are multiple. If there is only a single solution, prints this
 * solution instead.
 *
 * by Chloe Antonozzi 1670980 and Dominika Chabior 1700219 as group 110
 */

class SudokuSolver {

    int SUDOKU_SIZE = 9; // Size of the grid.
    int SUDOKU_MIN_NUMBER = 1; // Minimum digit to be filled in.
    int SUDOKU_MAX_NUMBER = 9; // Maximum digit to be filled in.
    int SUDOKU_BOX_DIMENSION = 3; // Dimension of the boxes (sub-grids that should contain all digits).

    int[][] grid = new int[][] { // The puzzle grid; 0 represents empty.
            { 0, 9, 0, 7, 3, 0, 4, 0, 0 }, // One solution.
            { 0, 0, 0, 0, 0, 0, 5, 0, 0 }, 
            { 3, 0, 0, 0, 0, 6, 0, 0, 0 },

            { 0, 0, 0, 0, 0, 2, 6, 4, 0 }, 
            { 0, 0, 0, 6, 5, 1, 0, 0, 0 }, 
            { 0, 0, 6, 9, 0, 7, 0, 0, 0 },

            { 5, 8, 0, 0, 0, 0, 0, 0, 0 }, 
            { 9, 0, 0, 0, 0, 3, 0, 2, 5 }, 
            { 6, 0, 3, 0, 0, 0, 8, 0, 0 }, 
        };

    int solutionCounter = 0; // Solution counter
    int[][] solutions = new int[SUDOKU_SIZE][SUDOKU_SIZE];

    // Checks if there are any conflicts
    boolean givesConflict(int r, int c, int d) {
        return !(rowConflict(r, d) && columnConflict(c, d) && boxConflict(r, c, d) && asteriskConflict(r, c, d));
    }

    // Checks if there is a row conflict
    boolean rowConflict(int r, int d) {
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (grid[r][i] == d) {
                return false;
            }
        }
        return true;
    }

    // Checks is there is column conflict
    boolean columnConflict(int c, int d) {
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            if (grid[i][c] == d) {
                return false;
            }
        }
        return true;
    }

    // Checks of there is a box conflict
    boolean boxConflict(int r, int c, int d) {
        int row = (r / 3) * 3;
        int col = (c / 3) * 3;

        for (int i = 0; i < SUDOKU_BOX_DIMENSION; i++) {
            for (int j = 0; j < SUDOKU_BOX_DIMENSION; j++) {
                if (grid[row + i][col + j] == d) {
                    return false;
                }
            }
        }
        return true;
    }

    // Checks if there is a asteriks conflict
    boolean asteriskConflict(int r, int c, int d) {
        if ((r == 2 && c == 2) || (r == 1 && c == 4) || (r == 2 && c == 6) || (r == 4 && c == 1) || (r == 4 && c == 4)
                || (r == 4 && c == 7) || (r == 6 && c == 2) || (r == 7 && c == 4) || (r == 6 && c == 6)) {
            if (grid[1][4] == d || grid[2][2] == d || grid[2][6] == d || grid[4][1] == d || grid[4][4] == d
                    || grid[4][7] == d || grid[6][2] == d || grid[6][6] == d || grid[7][4] == d) {
                return false;
            }
        }
        return true;
    }

    // Finds the next empty square.
    int[] findEmptySquare() {
        for (int i = 0; i < SUDOKU_SIZE; i++) {
            for (int j = 0; j < SUDOKU_SIZE; j++) {
                if (grid[i][j] == 0) {

                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    // Find all solutions for the grid, and stores the final solution.
    void solve() {

        int rempty = findEmptySquare()[0];
        int cempty = findEmptySquare()[1];

        if (rempty == -1 && cempty == -1) {
            solutionCounter++;

            if (solutionCounter == 1) {
                for (int i = 0; i < SUDOKU_SIZE; i++) {
                    for (int j = 0; j < SUDOKU_SIZE; j++) {
                        solutions[i][j] = grid[i][j];
                    }
                }
            }
        } else {
            for (int d = SUDOKU_MIN_NUMBER; d <= SUDOKU_MAX_NUMBER; d++) {
                if (givesConflict(rempty, cempty, d) == false) {
                    grid[rempty][cempty] = d;
                    solve();
                    grid[rempty][cempty] = 0;
                }
            }
        }

    }

    char printAsterisk(int i, int j) {
        if ((i == 2 && j == 8) || (i == 3 && j == 4) || (i == 9 && j == 4) || (i == 10 && j == 8)
                || i == 6 && (j == 2 || j == 8 || j == 14)) {
            return '>';
        } else if ((i == 2 && j == 10) || (i == 3 && j == 14) || (i == 9 && j == 14) || (i == 10 && j == 10)
                || (i == 6 && (j == 4 || j == 10 || j == 16))) {
            return '<';
        }
        return ' ';
    }

    // Print the sudoku grid.
    void print(int[][] grid) {

        int col = 0;
        int row = 0;

        for (int i = 0; i < SUDOKU_SIZE + 4; i++) {
            if ((i % 4) == 0) {
                System.out.println("+-----------------+");
            } else {
                col = 0;
                for (int j = 0; j < SUDOKU_SIZE + 10; j++) {
                    char printChar = printAsterisk(i, j);

                    if ((j % 6) == 0) {
                        System.out.print("|");
                    } else if ((j % 2) == 0) {
                        System.out.print(printChar);
                    } else if ((j % 2) == 1) {

                        if (grid[row][col] != 0) {
                            System.out.print(grid[row][col]);
                        } else {
                            System.out.print(" ");
                        }
                        col++;
                    }
                }
                System.out.println();
                row++;
            }

        }
    }

    // Run the actual solver.
    void solveIt() {
        solve();
        if (solutionCounter == 1)
            print(solutions);
        else
            System.out.println(solutionCounter);
    }

    public static void main(String[] args) {
        (new SudokuSolver()).solveIt();
    }
}