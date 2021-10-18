
/*
Chloe Antonozzi
1670980

16/09/2021
Repeat temperature conversion 
*/
import java.util.Scanner;

public class TemperatureConversion {
    Scanner scan = new Scanner(System.in);

    public void conversion() {
        System.out.println("Give a temperature in Celsius or Fahrenheit (type q to Quit):");
        while (scan.hasNextDouble()) {
            double input = scan.nextDouble();
            char celsiusOrFahrenheit = scan.next().charAt(0);

            if (celsiusOrFahrenheit == 'C' || celsiusOrFahrenheit == 'c') {
                double temperature = (input * 1.8) + 32;
                System.out.println(input + " degrees Celsius = " + temperature + " degrees Fahrenheit");
                System.out.println("");
                System.out.println("Give a temperature in Celsius or Fahrenheit (type q to Quit):");
            } else if (celsiusOrFahrenheit == 'F' || celsiusOrFahrenheit == 'f') {
                double temperature = (input - 32) / 1.8;
                System.out.println(input + " degrees Fahrenheit = " + temperature + " degrees Celsius");
                System.out.println("");
                System.out.println("Give a temperature in Celsius or Fahrenheit (type q to Quit):");
            } else {
                System.out.println("love");
            }
        }
    }

    public static void main(String[] args) {
        (new TemperatureConversion()).conversion();
    }
}
