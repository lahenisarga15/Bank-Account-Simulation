
public class Main {
    public static void main(String[] args) {
        Account account = new Account(5000);

        System.out.println("===== BANK ACCOUNT SIMULATION =====");
        System.out.println("Initial Balance: Rs. " + account.getBalance());

        account.deposit(2000);
        account.withdraw(1500);
        account.withdraw(7000);

        System.out.println("\nCurrent Balance: Rs. " + account.getBalance());

        account.showTransactionHistory();
    }
}
