import model.Account;
import service.AccountHolder;

public class BankAtmMain {
    public static void main(String[] args) {
        Account account = new Account(7000);
        System.out.println("Account balance: " + account.getBalance());

        AccountHolder accountHolder = new AccountHolder(account);
        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);
        Thread t3 = new Thread(accountHolder);

        t1.setName("Artur");
        t2.setName("John");
        t3.setName("Patrick");

        t1.start();
        t2.start();
        t3.start();
    }
}
