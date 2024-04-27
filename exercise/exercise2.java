import java.util.Scanner;

public class exercise2 {
public static void main(String[] args) {
    // calculate the sum of 45 = 55
  //  int sum = 45 + 55;
    // print the result of the addition
   // System.out.println(sum);

   // create a Scanner object to read input the user
   Scanner input = new Scanner(System.in);


   // prompt the user to input the first number
   System.out.println("input the first number:");

   // read and store the first number
   int num1 =input.nextInt();


   // prompt the user to input the second number
   System.out.println("input the second number:");


   // read and store the second number
   int num2 = input.nextInt();


   // calculate the sum of two number
   int sum = num1  + num2;


   // display a blank line for sepration
   System.out.println();


   // display the sum of two number
   System.out.println("sum:" + sum);
}
    
}
