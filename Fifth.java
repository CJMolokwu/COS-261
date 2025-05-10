
package fifth;
import java.util.Scanner;

public class Fifth {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        // To write the three integer numbers
        System.out.print("Enter the first integer number : ");
        num1 = input.nextInt();
        
        System.out.print("Enter the second integer number : ");
        num2 = input.nextInt();
        
        System.out.print("Enter the third integer number : ");
        num3 = input.nextInt();
        
        // To write a code to show the largest number
        int largest = Math.max(Math.max(num1, num2), num3);
        System.out.print("The largest number is : " + largest );
    }
    
}
