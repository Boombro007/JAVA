import java.util.*;

class WithdrawlLimitation extends Exception {
    public WithdrawlLimitation(String message) {
        super(message);
    }
}

class DepositLimitation extends Exception {
    public DepositLimitation(String message){
        super(message);
    }
}

public class BankingApplication {
    
    static double balance = 100000; 
    
    public static void withdrawl(double amount) throws WithdrawlLimitation {
        if (amount > 20000) {
            throw new WithdrawlLimitation("Amount more than sufficient!"); 
        } else if (amount > balance) {
            System.out.println("Entered amount is more than balance!");
        } else {
            balance = balance - amount;
            System.out.println("Transaction completed! Remaining balance: " + balance);
        }
    }

    public static void deposit(double amount) throws DepositLimitation {
        System.out.println("Note : Don't put damaged notes !");
        if(amount > 10000){
            throw new DepositLimitation("Amount is more than sufficient!");
        }
        else{
            balance += amount;
            System.out.println("Transaction completed! Remaining balance: " + balance);
        }
    }
    
    public static void main(String[] a) {
        int choice;
        double amount = 0;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("1 - Withdrawl\n2 - Deposit\n3 - Balance Enquiry\n");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter your Amount: ");
            amount = sc.nextDouble(); 
            
            try {
                BankingApplication.withdrawl(amount);
            } 
            catch (WithdrawlLimitation e) { 
                System.out.println("Transaction failed : " + e.getMessage());
            }
        } 
        else if (choice == 2) {
            System.out.print("Enter your Amount: ");
            amount = sc.nextDouble(); 
            
            try{
                BankingApplication.deposit(amount);
            }
            catch(DepositLimitation e){
                System.out.println("Transaction Failed ! " + e.getMessage());
            }
        }
        else if (choice == 3) {
            System.out.println("======================");
            System.out.println("Balance : " + balance);
            System.out.println("======================");
        }       
        sc.close();
    }
}