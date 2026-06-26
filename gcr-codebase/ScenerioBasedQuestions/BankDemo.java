class BankAccount{
    private String accountName;
    private String holder;
    private double balance;

    private static int totalAccounts=0;

    public BankAccount(String accountName, String holder, double balance){
        this.accountName = accountName;
        this.holder = holder;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("WithDraw Amount: "+amount);
        }
        else{
            System.out.println("Insufficient balance: "+ balance);
        }
    }

    public void getStatement() {
        System.out.println("\nAccount Statement");
        System.out.println("Account Number : " + accountName);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Current Balance: ₹" + balance);
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
public class BankDemo {
    public static void main(String[] args) {

        // Create 3 accounts
        BankAccount acc1 = new BankAccount("A101", "Rahul", 10000);
        BankAccount acc2 = new BankAccount("A102", "Priya", 15000);
        BankAccount acc3 = new BankAccount("A103", "Amit", 20000);

        // 5 Transactions for Account 1
        System.out.println("\n--- Transactions for Rahul ---");
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.deposit(3000);
        acc1.withdraw(5000);
        acc1.withdraw(10000);
        acc1.getStatement();

        // 5 Transactions for Account 2
        System.out.println("\n--- Transactions for Priya ---");
        acc2.withdraw(2000);
        acc2.deposit(4000);
        acc2.withdraw(3000);
        acc2.deposit(1000);
        acc2.withdraw(20000);
        acc2.getStatement();

        // 5 Transactions for Account 3
        System.out.println("\n--- Transactions for Amit ---");
        acc3.deposit(5000);
        acc3.withdraw(7000);
        acc3.deposit(2000);
        acc3.withdraw(1000);
        acc3.withdraw(25000);
        acc3.getStatement();

        // Display total accounts created
        System.out.println("\nTotal Accounts Created: "
                + BankAccount.getTotalAccounts());
    }
}
