class BankAccount {
    private int accountNumber;
    private String holder;
    private double balance;

    // Static variable to count total accounts
    private static int totalAccounts = 0;

    // Constructor
    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holder + " deposited ₹" + amount);
        }
    }

    // Withdraw method with overdraft check
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println(holder + " : Insufficient balance!");
        }
    }

    // Display account statement
    public void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Static method
    public static void showTotalAccounts() {
        System.out.println("\nTotal Accounts Created = " + totalAccounts);
    }
}

public class BankDemo {
    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 = new BankAccount(101, "Sona", 10000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 15000);
        BankAccount acc3 = new BankAccount(103, "Priya", 20000);

        // ----- 5 Transactions for Account 1 -----
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.deposit(500);
        acc1.withdraw(3000);
        acc1.withdraw(12000); // overdraft check

        // ----- 5 Transactions for Account 2 -----
        acc2.deposit(1000);
        acc2.withdraw(2000);
        acc2.deposit(3000);
        acc2.withdraw(5000);
        acc2.withdraw(20000); // overdraft check

        // ----- 5 Transactions for Account 3 -----
        acc3.deposit(4000);
        acc3.withdraw(2500);
        acc3.deposit(1500);
        acc3.withdraw(1000);
        acc3.withdraw(30000); // overdraft check

        // Print statements
        acc1.getStatement();
        acc2.getStatement();
        acc3.getStatement();

        // Total accounts created
        BankAccount.showTotalAccounts();
    }
}