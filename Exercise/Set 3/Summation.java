
/*
Chloe Antonozzi
14/09/2021

Calculate sum of numbers on input 
*/
import java.util.*;

public class Summation {
    Scanner sc = new Scanner(System.in);
    int number; // number just reads
    int multiplication; // running sum
    int times; // number of numbers entered

    void doSummation() {
        times = 0;
        multiplication = 1;
        System.out.println("Type a sequence of integer numbers, terminated by a 0:");
        while (sc.hasNextInt()) {
            number = sc.nextInt();
            if (number > 0 || number < 0) {
                multiplication = number * multiplication;
                times++;
            } else {
                System.out.println("Multiplication is " + multiplication);
                System.out.println("The amount of variables entered is " + times);
                break;
            }
        }
    }

    public static void main(String[] args) {
        (new Summation()).doSummation();
    }
}
