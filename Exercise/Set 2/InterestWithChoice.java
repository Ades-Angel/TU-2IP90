/*
Chloe Antonozzi
14/09/2021

Input balcance and calculates balance after 1 year
*/
import java.util.Scanner;

public class InterestWithChoice {
    Scanner scan = new Scanner(System.in);
    
    public void calculateInterest(){
        System.out.println("Enter the starting amount: ");
        double balance = scan.nextDouble();
        double rate = 2.5;
        double rateBonus = 3.0;
        double deduction = -0.5;
        double interest;

        if (balance >= 10000){
            interest = (balance*rateBonus/100.0);
            System.out.println(interest+balance);
        }else if(balance>0 && balance<10000){
            interest = (balance*rate/100.0);
            System.out.println(interest+balance);
        }else{
            interest = (balance*deduction/100.0);
            System.out.println(balance-interest);
        }
    }
    public static void main(String[] args){
        (new InterestWithChoice()).calculateInterest();
    }
}
