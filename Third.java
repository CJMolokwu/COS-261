
package third;

import java.util.Scanner;
public class Third {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer number :");
        num = input.nextInt();
        
        // write an if statement to check if the number is even or odd
        if(num % 2 == 0){
            System.out.print(num + " is an even number");
        }
        else{
            System.out.print(num + " is an odd number");
        }
    }
    
}
