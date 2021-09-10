/**
 * Circle
 * Chloe Antonozzi
 * 1670980
 */

import java.util.Scanner;
import java.lang.Math;

public class Circle {
    Scanner scan = new Scanner(System.in);

    public void run(){
        double midpointXCircle1;
        double midpointYCircle1;
        double radiusCircle1;
        double midpointXCircle2;
        double midpointYCircle2;
        double radiusCircle2;
        double xCoordinatePoint;
        double yCoordiantePoint;
        double distanceCircle1;
        double distanceCircle2;

        System.out.println("Enter the X co-ordinate for the midpoint of circle 1: ");
        midpointXCircle1 = scan.nextDouble();
        System.out.println("Enter the Y co-ordinate for the midpoint of circle 1: ");
        midpointYCircle1 = scan.nextDouble();
        System.out.println("Enter the radius for circle 1: ");
        radiusCircle1 = scan.nextDouble();
        System.out.println("Enter the X co-ordinate for the midpoint of circle 2: ");
        midpointXCircle2 = scan.nextDouble();
        System.out.println("Enter the X co-ordinate for the midpoint of circle 2: ");
        midpointYCircle2 = scan.nextDouble();
        System.out.println("Enter the radius for circle 2: ");
        radiusCircle2 = scan.nextDouble();
        System.out.println("Enter the X co-ordinate for your point: ");
        xCoordinatePoint = scan.nextDouble();
        System.out.println("Enter the Y co-ordinate for your point: ");
        yCoordiantePoint = scan.nextDouble();

        distanceCircle1 = Math.sqrt(Math.pow(xCoordinatePoint - midpointXCircle1,2)+ Math.pow(yCoordiantePoint - midpointYCircle1,2));
        distanceCircle2 = Math.sqrt(Math.pow(xCoordinatePoint - midpointXCircle2,2)+ Math.pow(yCoordiantePoint - midpointYCircle2,2));

        if (radiusCircle1 <= 0 || radiusCircle2 <= 0){
            System.out.println("input error");
        }else{
            if (radiusCircle1 - distanceCircle1 >= 0 && radiusCircle2 - distanceCircle2 < 0){
                System.out.println("The point lies in the first circle");
            }else if (radiusCircle1 - distanceCircle1 < 0 && radiusCircle2 - distanceCircle2 >= 0){
                System.out.println("The point lies in the second circle");
            }else{
                System.out.println("The point lies in both circles");
            }
        }

    }
    public static void main(String[] args){
        (new Circle()).run();
    }
}
