/*
*Domi & Chloe
*14/09/2021
*Calculate sum of numbers on input 
*/

import java.util.*;

public class Summation {
    Scanner sc = new Scanner(System.in);
    int number; // number just reads
    int multiplication; // running sum
    int times; // number of numbers entered

    void doSummation(){
        times = 0;
        multiplication = 2;
        while(sc.hasNextInt()){
            number = sc.nextInt();
            multiplication = number*multiplication;
            times++;
        }
        System.out.println("Multiplication is "+ multiplication);
        System.out.println("The amount of variables entered is "+times);
    }
    public static void main(String[] args){
        (new Summation()).doSummation();
    }
}