
package fourth;

import java.util.Scanner;
public class Fourth {

    
    public static void main(String[] args) {
        int num;
        int multiply;
        Scanner input = new Scanner(System.in);
        
        // To write an integer number

        System.out.print("Enter an integer number : ");
        num = input.nextInt();
        
        // To calculate the number multiplication table
        System.out.println("Multiplication Table of " + num + ":");
        for(int i = 1; i<=12; i++){
            multiply = num * i;
            System.out.println(num + "  x " + i + " = " + multiply);
        }
       
        
       
        
        

            
        }
        
    
    
}
