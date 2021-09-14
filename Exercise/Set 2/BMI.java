/*
Chloe Antonozzi
14/09/2021

Calculates the BMI of a person
*/
import java.util.Scanner;

public class BMI {
    Scanner scan = new Scanner(System.in);

    public void calculateBMI(){
        String name = scan.nextLine();
        double weight = scan.nextDouble();
        double height = scan.nextDouble();

        double bmi = weight / (height*height);

        String output = String.format("Hello %s, your BMI is %.1f",name, bmi);
        System.out.println(output);
    }
    public static void main(String[] args){
        (new BMI()).calculateBMI();
    }
}
