public class Bank implements MyInterface {

    private String accountNumber;
    private double amount;

    public Bank(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount);
        this.amount -= amount;
    }

    public void transfer(String accountNumber, double amount) {
        System.out.println("Transferring " + amount + " to " + accountNumber);
        this.accountNumber = accountNumber;
        this.amount -= amount;
    }

    public double getDeposit(){
        System.out.println("Depositing " + amount + " to " + accountNumber);
        return amount;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
}
