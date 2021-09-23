/*
Chloe Antonozzi
07/09/2021 

Example to demonstrate console output
*/

public class HelloWorld {
    // put message on console
    void show() {
        System.out.println("Hello world, this is a Java program.");
        System.out.println(" ");
        System.out.println("");
        System.out.println("Good luck, programmer");
    }

    public static void main(String[] args) {
        (new HelloWorld()).show();
    }
}

// if display is chnaged in both line 10 and 15, then program works fine
// Main and system are not know to java, not one of its functions
// A syntax error occurs
