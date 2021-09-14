/*
Chloe Antonozzi
14/09/2021

3 number inputs, outputs max number.
*/
import java.util.Scanner;

public class MaxNumber2 {
    Scanner scan = new Scanner(System.in);

    public void max(){
        System.out.println("Enter the first number (integer):");
        int number1 = scan.nextInt();
        System.out.println("Enter the second number (integer):");
        int number2 = scan.nextInt();
        System.out.println("Enter the third number (integer):");
        int number3 = scan.nextInt();

        if (number1 > number2 && number1>number3){
            System.out.println(number1);
        }else if (number2>number1 && number2>number3){
            System.out.println(number2);
        }else{
            System.out.println(number3);
        }
    }
    public static void main(String[] args){
        (new MaxNumber2()).max();
    }
}
