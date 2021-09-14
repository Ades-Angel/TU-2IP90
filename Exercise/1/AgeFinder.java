/*
Chloe Antonozzi
09/09/21

Calculates the age from two inputs
*/
import java.util.Scanner;

public class AgeFinder {
    Scanner scan = new Scanner(System.in);
    
    public void ageCheck() {
        String dateOfBirth = scan.nextLine();
        String currentDate = scan.nextLine();
        int yearDoB = Integer.parseInt(dateOfBirth.substring(0,4));
        int yearCD = Integer.parseInt(currentDate.substring(0,4));
        int monthDoB = Integer.parseInt(dateOfBirth.substring(4,6));
        int monthCD = Integer.parseInt(currentDate.substring(4,6));

        int age = yearCD - yearDoB;
        int month = monthCD - monthDoB;

        if (month < 0 || (month == 0 && yearCD < yearDoB)){
            System.out.println("You are "+(age -1) +" years old");
        }else{
            System.out.println("You are "+age+" years old");
        }

        System.out.println();
    }
    public static void main(String[] args){
        (new AgeFinder()).ageCheck();
    }
}
