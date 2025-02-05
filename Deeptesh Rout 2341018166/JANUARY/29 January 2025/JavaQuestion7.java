class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        double interestRate = 0.03; // 3% interest rate
        balance += balance * interestRate;
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        double interestRate = 0.05; // 5% interest rate for savings account
        balance += balance * interestRate;
        return balance;
    }
}

public class JavaQuestion7 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        SavingsAccount savingsAcc = new SavingsAccount(1000);

        System.out.println("Bank Account Balance after interest: " + acc.calculateInterest());  // Output: 1030.0
        System.out.println("Savings Account Balance after interest: " + savingsAcc.calculateInterest()); // Output: 1050.0
    }
}

