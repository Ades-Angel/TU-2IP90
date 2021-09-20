/**
 * GuessingGameBasic -- first part of asignment 2 in 2ip90
 * Dominika Chabior
 * 17002019
 * Chloe Antonozzi
 * 1670980
 * 17/09/2021
 */
import java.util.*;

class GuessingGame{
    Scanner scanner = new Scanner(System.in);
    int guesses = 0;
    int code;
    String[][] strArray = new String[7][101];   //setting up 2D array
    int rows = 0;

    void run() {
        for (int j=0; j<7; j++){        //sets up all the columns and rows to a dot
            for (int i =0; i<=100; i++){
                strArray[j][i] = "·";
            }
        }

        System.out.println("Do you want to enter the secret code yourself?");
        String answer = scanner.nextLine();

        if (answer.equals("yes")){      //checks the answer (yes or no)
            System.out.println("Secretly type the code");
            code = scanner.nextInt();
        }
        else{
            System.out.println("Type an arbitrary number");
            code = scanner.nextInt();
            Random randomGenerator = new Random(code);    //generates a number
            int intRandom = randomGenerator.nextInt(100);
            code = intRandom;           //changes the randomly chosen number to code
            System.out.println(code);
        }

        System.out.println("Start guessing!");

        while (guesses<=7){     //loop for the number of guesses
            int guess = scanner.nextInt();
            guesses = guesses + 1;
            strArray[rows][guess] = "X";
            strArray[rows][code] = "|";
            if (guess == code){     //if the guess is correct
                System.out.println("Good guess! You won.");
                System.out.println(guesses + " guesses:");
                strArray[guesses-1][guess] = "X";
                for (int j =0; j<guesses;j++){     //loop to print out the rows of the 2D array
                    System.out.println(Arrays.toString(strArray[j]).replace(", ","").replace("[","").replace("]",""));
                }
                break;
            }
            else if (guesses == 7 && guess != code){
                System.out.println("No more guesses, you lost.");
                System.out.println(guesses + " guesses:");
                for (int j =0; j<guesses;j++){      //loop to print out the rows of the 2D array
                    System.out.println(Arrays.toString(strArray[j]).replace(", ","").replace("[","").replace("]",""));
                }
                break;
            }
            else if (guess > code){
                System.out.println("Lower");
            }
            else{
                System.out.println("Higher");
            }
            rows++;
        }
    }
    public static void main(String[] args) {
        (new GuessingGame()).run();
    }
}
