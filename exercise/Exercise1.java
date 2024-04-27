
//Write a Java program to print 'Hello' on screen and your name on a separate line.

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
      //  System.out.println(" hello\nkeshav thakur");
     // create a scanner to objects to read input from the console
      Scanner input = new Scanner (System.in);
      // prompt the user to input their first name
      System.out.println("input your first name");
      String fname = input.next();
      // prompt the user to input the last name
      String iname = input.next();
      // output a greeting message with the user full name
      System.out.println();
      System.out.println("Hello \n" + fname + " " + iname );
    }
    
}
