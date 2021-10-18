
/*
Chloe Antonozzi 
1670980

28/09/2021
Calculates functions and prints answers
*/
import java.util.*;

public class Functions {
    Scanner scan = new Scanner(System.in);
    double a, b, c;

    double f(double a, double b, double c, double x) {
        double f = a * (x * x) - b * (2 * x) + c;
        return f;
    }

    void table() {
        System.out.format("%6s%10s", "X", "f(x)");
        System.out.println(" ");
        System.out.println("-------------------");

        for (double i = -3.0; i <= 3; i = i + 0.5) {
            System.out.printf("%8.2f", i);
            System.out.printf("%8.2f", f(a, b, c, i));
            System.out.println(" ");
        }
    }

    void checkGuess() {
        int count = 1;
        boolean flag = true;
        System.out.println("Guess an x such that f(x) = 0: ");

        while (flag == true) {
            double guess = scan.nextDouble();

            if (f(a, b, c, guess) < 0.001 && f(a, b, c, guess) > -0.001) {
                System.out.println(" ");
                System.out.println("Good job you found the correct x.");
                System.out.printf("%.2f", guess);
                System.out.println(" ");
                System.out.println("Number of guesses: " + count);
                flag = false;
            } else {
                System.out.println("Try again: ");
                count++;
            }
        }
    }

    void run() {
        System.out.println("Please enter values for a, b and c :");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        checkGuess();
        System.out.println(" ");
        table();

    }

    public static void main(String[] args) {
        (new Functions()).run();
    }
}
