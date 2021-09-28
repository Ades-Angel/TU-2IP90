
/*
Chloe Antonozzi
1670980
23/09/2021
*/
import java.util.*;

public class StarWriter {
    Scanner scan = new Scanner(System.in);

    void printStars(int n, char c) {
        for (int i = 0; i < n; i++) {
            printSpaces(1);
            System.out.print(c);
            printSpaces(1);
        }
    }

    void nl() {
        System.out.println("");
    }

    void printSpaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    void printA(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
    }

    void printB(char c) {
        printStars(5, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(5, c);
        nl();
    }

    void printC(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printD(char c) {
        printStars(4, c);
        nl();
        printStars(5, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(5, c);
        nl();
        printStars(4, c);
        nl();
    }

    void printE(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        nl();
        printStars(4, c);
        nl();
        printStars(4, c);
        nl();
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printF(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        nl();
        printStars(4, c);
        nl();
        printStars(4, c);
        nl();
        printStars(2, c);
        nl();

        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
    }

    void printG(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        nl();
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printH(char c) {
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
    }

    void printI(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printJ(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(4, c);
        nl();
        printStars(4, c);
        nl();
    }

    void printK(char c) {
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(4);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(2);
        printStars(2, c);
        nl();
        printStars(4, c);
        nl();

        printStars(4, c);
        nl();
        printStars(2, c);
        printSpaces(2);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(4);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
    }

    void printL(char c) {
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printM(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(2);
        printStars(1, c);
        printSpaces(1);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(2);
        printStars(1, c);
        printSpaces(1);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
    }

    void printN(char c) {
        printStars(2, c);
        printSpaces(12);
        printStars(2, c);
        nl();

        printStars(3, c);
        printSpaces(9);
        printStars(2, c);
        nl();

        printStars(4, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(2);
        printStars(2, c);
        printSpaces(4);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(4);
        printStars(2, c);
        printSpaces(2);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(4, c);
        nl();

        printStars(2, c);
        printSpaces(9);
        printStars(3, c);
        nl();

        printStars(2, c);
        printSpaces(12);
        printStars(2, c);
        nl();
    }

    void printO(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printP(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
        printStars(2, c);
        nl();
    }

    void printQ(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printR(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printStars(2, c);
        printSpaces(1);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(4);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
    }

    void printS(char c) {
        printStars(6, c);
        nl();

        printStars(2, c);
        nl();
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();

        printSpaces(12);
        printStars(2, c);
        nl();
        printSpaces(12);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
    }

    void printT(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
        printSpaces(6);
        printStars(2, c);
        nl();
    }

    void printU(char c) {
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printV(char c) {
        printStars(2, c);
        printSpaces(10);
        printStars(2, c);
        nl();

        printSpaces(1);
        printStars(2, c);
        printSpaces(8);
        printStars(2, c);
        nl();

        printSpaces(3);
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printSpaces(5);
        printStars(2, c);
        printSpaces(4);
        printStars(2, c);
        nl();

        printSpaces(7);
        printStars(4, c);
        nl();

        printSpaces(9);
        printStars(3, c);
        nl();
    }

    void printW(char c) {
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(6);
        printStars(2, c);
        nl();

        printStars(2, c);
        printSpaces(2);
        printStars(1, c);
        printSpaces(1);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(2);
        printStars(1, c);
        printSpaces(1);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printX(char c) {
        printStars(2, c);
        printSpaces(9);
        printStars(2, c);
        nl();
        printSpaces(2);
        printStars(2, c);
        printSpaces(5);
        printStars(2, c);
        nl();
        printSpaces(4);
        printStars(2, c);
        printSpaces(1);
        printStars(2, c);
        nl();

        printSpaces(6);
        printStars(3, c);
        nl();

        printSpaces(4);
        printStars(2, c);
        printSpaces(1);
        printStars(2, c);
        nl();
        printSpaces(2);
        printStars(2, c);
        printSpaces(5);
        printStars(2, c);
        nl();
        printStars(2, c);
        printSpaces(9);
        printStars(2, c);
        nl();
    }

    void printY(char c) {
        printStars(2, c);
        printSpaces(8);
        printStars(2, c);
        nl();

        printSpaces(2);
        printStars(2, c);
        printSpaces(4);
        printStars(2, c);
        nl();

        printSpaces(4);
        printStars(4, c);
        nl();

        printSpaces(7);
        printStars(2, c);
        nl();
        printSpaces(7);
        printStars(2, c);
        nl();
        printSpaces(7);
        printStars(2, c);
        nl();
        printSpaces(7);
        printStars(2, c);
        nl();
        printSpaces(7);
        printStars(2, c);
        nl();

    }

    void printZ(char c) {
        printStars(6, c);
        nl();
        printStars(6, c);
        nl();

        printSpaces(12);
        printStars(2, c);
        nl();
        printSpaces(8);
        printStars(2, c);
        nl();
        printSpaces(4);
        printStars(2, c);
        nl();
        printSpaces(0);
        printStars(2, c);
        nl();

        printStars(6, c);
        nl();
        printStars(6, c);
        nl();
    }

    void printWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            c = Character.toUpperCase(c);

            if (c == 'A') {
                printA(c);
                nl();
            } else if (c == 'B') {
                printB(c);
                nl();
            } else if (c == 'C') {
                printC(c);
                nl();
            } else if (c == 'D') {
                printD(c);
                nl();
            } else if (c == 'E') {
                printE(c);
                nl();
            } else if (c == 'F') {
                printF(c);
                nl();
            } else if (c == 'G') {
                printG(c);
                nl();
            } else if (c == 'H') {
                printH(c);
                nl();
            } else if (c == 'I') {
                printI(c);
                nl();
            } else if (c == 'J') {
                printJ(c);
                nl();
            } else if (c == 'K') {
                printK(c);
                nl();
            } else if (c == 'L') {
                printL(c);
                nl();
            } else if (c == 'M') {
                printM(c);
                nl();
            } else if (c == 'N') {
                printN(c);
                nl();
            } else if (c == 'O') {
                printO(c);
                nl();
            } else if (c == 'P') {
                printP(c);
                nl();
            } else if (c == 'Q') {
                printQ(c);
                nl();
            } else if (c == 'R') {
                printR(c);
                nl();
            } else if (c == 'S') {
                printS(c);
                nl();
            } else if (c == 'T') {
                printT(c);
                nl();
            } else if (c == 'U') {
                printU(c);
                nl();
            } else if (c == 'V') {
                printV(c);
                nl();
            } else if (c == 'W') {
                printW(c);
                nl();
            } else if (c == 'X') {
                printX(c);
                nl();
            } else if (c == 'Y') {
                printY(c);
                nl();
            } else if (c == 'Z') {
                printZ(c);
                nl();
            } else {
                System.out.print("");
            }
        }
    }

    void write() {
        System.out.println("Enter a word: ");
        String word = scan.nextLine();
        nl();
        printWord(word);
    }

    public static void main(String[] aargs) {
        (new StarWriter()).write();
    }

}
