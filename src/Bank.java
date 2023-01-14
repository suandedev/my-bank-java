public class Bank {
    
    // encapsulation
    private String accountNumber;
    private double balance;

    public Bank(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public void Deposit(double amount) {
        this.balance += amount;
    }

    public void WithDraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
}
