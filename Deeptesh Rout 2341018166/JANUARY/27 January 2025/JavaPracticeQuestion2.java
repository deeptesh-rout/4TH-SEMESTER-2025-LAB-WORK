class BankAccount {
    
    int accountNumber;
    String accountHolderName;
    double balance;
    
    BankAccount(int accountNum, String accountName, double amount) {
        this.accountNumber = accountNum;
        this.accountHolderName = accountName;
        this.balance = amount;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Your balance is: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        }
    }
    
    public void checkBalance() {
        System.out.println("Account balance: " + balance);
    }
}

public class JavaPracticeQuestion2 {

    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(23410181, "Peter Parker", 5000000.00);
       
        account.checkBalance();     
        account.deposit(2000.00);
        account.withdraw(1000.00);       
        account.checkBalance();       
        account.withdraw(7000.00);       
        account.deposit(-500.00);
    }
}
