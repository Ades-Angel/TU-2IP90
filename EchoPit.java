/*
Chloe Antonozzi
16/09/2021

Reads a sequence of integers terminated by -1 and prints them.
*/
import java.util.*;

public class EchoPit {
    Scanner scan = new Scanner(System.in);
    ArrayList<String>str; //the numbers from input to be echoed
    String result = ""; // last read string from input

    public void echo(){
        str = new ArrayList<String>();
    
        while (result.equals("")){
            String str1 = scan.nextLine();
            result =  str1 + result;
        }
        for (int i=0; i<str.size(); i++){
            System.out.println(result);
        }
    }
    public static void main(String[] args){
        (new EchoPit()).echo();
    }    
}
