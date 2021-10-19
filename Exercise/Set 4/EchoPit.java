/*
Chloe Antonozzi
16/09/2021

19/10/2021
*/
import java.util.*;

public class EchoPit {
    Scanner scan = new Scanner(System.in);

    public String reverse(String input) {
        List<String> list = Arrays.asList(input.split(" "));
        Collections.reverse(list);
        return String.join(" ", list);
    }

    public void echo() {
        String input = scan.nextLine();
        System.out.println(reverse(input));
    }

    public static void main(String[] args) {
        (new EchoPit()).echo();
    }
}
