public class App {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank("1234");
        bank.deposit("123456789", 100);
        // bank.withdraw(50);
        bank.transfer("987654321", 25);
        bank.getDeposit();
        // bank.getAccountNumber();
    }
}
