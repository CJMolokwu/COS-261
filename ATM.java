
package atm;
import java.util.Scanner;
public class ATM {
  static double balance = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    balance += sc.nextDouble();
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    if (amount <= balance) balance -= amount;
                    else System.out.println("Insufficient funds");
                    break;
                case 4:
                    return;
            }
        }
    }
}

        

    }
    
}
