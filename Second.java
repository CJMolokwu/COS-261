
package second;

import java.util.Scanner;
public class Second {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum;
   
      Scanner input = new Scanner(System.in);
      // write a code to accept two integer numbers
      System.out.print("Enter the first integer number :");
      num1 = input.nextInt();
      System.out.print("Enter the second integer number :");
      num2 = input.nextInt();
      
      // write the code to sum the integers
      sum = num1 + num2;
      System.out.print("The sum of the two integers is :" + sum);
    }
    
}
