/*
Chloe Antonozzi
1670980

09/10/2021
*/

import javax.swing.*;
import java.awt.*;

public class Letter extends JFrame { 
  static int sn = 0; // last used serial number 
  
  String text = " ";  //default text of Letter
  int fontSize = 120; //default fontsize of text in pixel height
  int step = 10; 
  
  LetterPanel panel;
  
  /********** Constructors *********/ 
  
  // creates a blank Letter 
  public Letter() {
    this(" ");
  }
  
  //creates a Letter with text s
  //at the top left of the screen, with newer Letters shifted farther to the right
  public Letter(String s) {
    this.panel = new LetterPanel(this);
    this.add(this.panel);
    if (s!=null && s.length()>0) {
      text = s.substring(0,1);
    }
    this.setSize(120,150);
    this.setTitle("#"+sn++);
    this.setLocation(10*sn, 10);
    this.setVisible(true);
  }
  
  //creates a Letter with text c
  public Letter(char c) {
    this(String.valueOf( c ));
  }
  
  //changes the text to t
  public void setText(String t) {
    if (t!=null) { text = t; }
    this.repaint();
  }
  
  //ditto 
  public void setText(char c) {
    this.setText(String.valueOf( c ));
  }
  
  //changes (sets) the background color 
  public void setColor(Color c) {
    this.panel.setBackground(c);
  }
  
  //changes (sets) the fontsize to a height of fs pixels 
  public void setFontSize(int fs) {
    this.fontSize = fs;
    this.repaint();
  }
  
  //centers the Letter on the screen
  public void center() {
    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
    int a = screen.width;
    int b = this.getWidth();
    int x = (a-b)/2;
    //int x = (screen.getWidth() - this.getWidth())/2;
    int y = screen.height/2 - this.getHeight()/2;
    this.setLocation(x, y);
    this.toFront();
  }
  
  /* methods to move the Letter on the screen */
  
  // move dx pixels to the right and dy down; negative arguments move left resp. up
  public void moveRel(int dx, int dy) {
    Point here = this.getLocationOnScreen();
    this.setLocation(here.x + dx, here.y + dy);
    this.toFront();
  }
  
  // four methods that move step pixels to the right, left, down, up
  public void moveRight() {
    this.moveRel(step,0);
  }
  
  public void moveLeft() {
    this.moveRel(-step,0);
  }
  
  public void moveDown() {
    this.moveRel(0,step);
  }
  
  public void moveUp() {
    this.moveRel(0,-step);
  }
  
  // move Letter to an absolute position on the screen
  public void moveAbs(int x, int y) {
    this.setLocation(x,y);
  }
  
  //pausing is not needed for experiments from the Interactions
  // pane of DrJava
  //pause execution for ms milliseconds
  public static void pauseInMs(int ms) {
    try { 
      Thread.sleep(ms); 
    } catch (InterruptedException e) {
      System.err.println(e); 
    }
  }
  
  //pause execution for sec seconds           
  public static void pauseInSec(double sec) {
    pauseInMs((int)sec*1000);
  }
  
  public void animate() {
    // INSERT YOUR ANIMATION CODE HERE
    Letter x = new Letter("X");
    x.pauseInSec(0.5);
    this.setColor(Color.RED);
    this.moveRel(100,50); 

    x.pauseInSec(1.0);
    this.setColor(Color.ORANGE);
    this.moveRel(100,50);

    x.pauseInSec(1.5);
    this.setColor(Color.YELLOW);
    this.moveRel(100,50);

    x.pauseInSec(2.0);
    this.setColor(Color.GREEN);
    this.moveRel(100,50);

    x.pauseInSec(2.5);
    this.setColor(Color.blue);
    this.moveRel(100,50);

  }  

  public void randomDirection(){
    double r = Math.random() * 1;
    if (r < 0.25){
      this.moveRel(100,0);
    }else if(r < 0.5 && r >= 0.25){
      this.moveRel(-100,0);
    }else if (r < 0.75 && r >= 0.5){
      this.moveRel(0,100);
    }else{
      this.moveRel(0,-100);
    }
  }
  
  public static void main(String[] ar) {
    System.out.println( "This class is meant to be used in the Interactions Pane of DrJava," );            
    System.out.println( "not to run from the method main." );
  }
}

class LetterPanel extends JPanel {
  Letter letter;
  
  LetterPanel(Letter let) {
    this.letter = let;
  }
  
  //redraws the Letter, called by the windowing system
  //text is vertically more or less centered, horizontally it is not 
  public void paint(Graphics g) {
    super.paintComponent(g);
    int bar = 10;           // height of title bar (Mac OS); estimation
    int h = getHeight() - bar; 
    
    Font font = new Font(g.getFont().getFontName(), Font.BOLD, letter.fontSize);      
    g.setFont(font);
    g.drawString(letter.text, 25, (h+letter.fontSize)/2 - 10);
  }
  
}

