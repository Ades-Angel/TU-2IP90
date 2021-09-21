/**
 * GuessingGameAdvanced -- second part of assignment 2 in 2ip90
 * @author Dominika Chabior
 * 17002019
 * @author Chloe Antonozzi
 * 1670980
 * 19/09/2021
 */
import java.util.*;

public class GuessingGameAdvanced {
    Scanner scanner = new Scanner(System.in);

    void run(){
        int max = 1000;
        int min = 0;
        
        System.out.println("Think of a secret number not smaller than 0 and not greater than 1000. Type ’go’ when you have one.");
        String answer = scanner.nextLine();
    
        for (int i=0; i<10; i++) { //gives the computer 10 tries
            if (answer.equals("go")){
                int computerGuess = (max + min)/2; // alculates a number between a range
                System.out.println(computerGuess);
                String result = scanner.nextLine();
                if (result.equals("h") || result.equals("higher")){ //checks input
                    min = computerGuess;
                }
                else if (result.equals("l") || result.equals("lower")){
                    max = computerGuess; 

                }
                else if (result.equals("guessed")){
                    break;
                }
                else{
                    System.out.println("I give up.");
                    break;
                }
            }
            else{
                break;
            }
        }

    
    }
    public static void main(String[]args){
        (new GuessingGameAdvanced()).run();
    }   
}
