/*
Chloe Antonozzi
14/09/2021

Calculates the BMI of a person
*/
import java.util.Scanner;

public class BMI {
    Scanner scan = new Scanner(System.in);

    public void calculateBMI(){
        System.out.println("Enter your name:"):
        String name = scan.nextLine();
        System.out.println("Enter your weight (Kg):"):
        double weight = scan.nextDouble();
        System.out.println("Enter yout height (meters):"):
        double height = scan.nextDouble();

        double bmi = weight / (height*height);

        String output = String.format("Hello %s, your BMI is %.1f",name, bmi);
        System.out.println(output);
    }
    public static void main(String[] args){
        (new BMI()).calculateBMI();
    }
}
