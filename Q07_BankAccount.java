class BankAccount {
    private double balance;

    BankAccount(double openingBalance) {
        if (openingBalance >= 0) {
            balance = openingBalance;
        } else {
            balance = 0;
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: Rs. %.2f%n", amount);
        } else {
            System.out.println("Invalid deposit. Amount must be greater than zero.");
        }
    }

    void displayBalance() {
        System.out.printf("Current Balance: Rs. %.2f%n", balance);
    }
}

public class Q07_BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00);
        account.displayBalance();
        account.deposit(500.00);
        account.deposit(-100.00);
        account.displayBalance();
    }
}
