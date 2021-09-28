
/*
Chloe Antonozzi
1670980
07/09/2021

Outputs if a year leaps as true or false
*/
import java.util.Scanner;

public class LeapYear {
    Scanner scan = new Scanner(System.in);

    public void yearCheck() {
        int year;
        boolean is_leap = false;
        System.out.println("Enter a year: ");
        year = scan.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    is_leap = true;
                else
                    is_leap = false;
            } else
                is_leap = true;
        } else {
            is_leap = false;
        }

        if (is_leap == true)
            System.out.println("The statement year " + year + " is a leap year is true.");
        else
            System.out.println("The statement year " + year + " is a leap year is false.");

    }

    public static void main(String[] args) {
        (new LeapYear()).yearCheck();
    }

}
