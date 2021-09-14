/*
Chloe Antonozzi
11/09/2021

Changes tempature from Fahrenheit to Celsius
*/
import java.util.Scanner;

public class FahrenheitToCelsius {
    Scanner scan = new Scanner(System.in);

    public void calculateCtoF(){
        System.out.println("Give a temperature in Fahrenheit:");
        double fahrenheit = scan.nextDouble();

        double celsius = ((5*(fahrenheit - 32.0))/9.0);
        System.out.println(fahrenheit + " degrees Farhenheit = " + celsius + " degrees Celsius");
    }
    public static void main(String[] args){
        (new FahrenheitToCelsius()).calculateCtoF();
    }
}