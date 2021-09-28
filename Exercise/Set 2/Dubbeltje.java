
/*
Chloe Antonozzi
1670980
14/09/2021

Adds an amount of Dubbeltje to Euros.
*/
import java.util.Scanner;

public class Dubbeltje {
    Scanner scan = new Scanner(System.in);

    public void addDubbeltje() {
        System.out.println("Enter Euros (Integer):");
        int euro = scan.nextInt();
        System.out.println("Enter Dubbeltje:");
        double dubbeltje = scan.nextDouble();

        double euroDubbeltje = euro + (dubbeltje / 10);
        String output = String.format("%d euro plus %.0f dubbeltjes is %.2f euro", euro, dubbeltje, euroDubbeltje);
        String output2 = String.format("%d euro plus %.0f dubbeltjes is %.6f euro", euro, dubbeltje, euroDubbeltje);
        String output3 = String.format("%d euro plus %.0f dubbeltjes is %.12f euro", euro, dubbeltje, euroDubbeltje);
        String output4 = String.format("%d euro plus %.0f dubbeltjes is %.18f euro", euro, dubbeltje, euroDubbeltje);

        System.out.println(output);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);

    }

    public static void main(String[] args) {
        (new Dubbeltje()).addDubbeltje();
    }
}
