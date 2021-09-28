
/*
Chloe Antonozzi
1670980
09/09/2021

Interest calculation
*/
import java.util.Scanner;

public class Interest {
    Scanner scan = new Scanner(System.in);

    public void calcInterest() {
        double interest;
        double tax;

        System.out.println("Enter the starting amount ");
        double balance = scan.nextDouble();
        System.out.println("Give interest rate as a percentage ");
        double rate = scan.nextDouble();// percentage
        System.out.println("Give the tax rate as a percentage ");
        double taxRate = scan.nextDouble(); // percentage

        interest = (balance * rate / 100.0);
        tax = ((balance / taxRate) / 100.0);

        System.out.println("After a year you get as interest: " + interest);

        System.out.println("After a year your balance with interest is: " + (balance + interest));

        System.out.println("This is the tax fo this year: " + tax);
    }

    public static void main(String[] args) {
        (new Interest()).calcInterest();
    }
}
