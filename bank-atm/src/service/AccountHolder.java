package service;

import model.Account;

import java.util.stream.IntStream;

public class AccountHolder implements Runnable{
    private Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        IntStream.rangeClosed(1, 3).map(tryWithdraw -> 1200).forEachOrdered(this::makeWithdraw);
    }

    private synchronized void makeWithdraw(int withdrawAmount) {
        if(isAccountBalanceEnough(withdrawAmount)) {
            printActivity(withdrawAmount, " is going to withdraw $");
            pauseExecution();
            account.withdraw(withdrawAmount);   // withdrawing money
            printActivity(withdrawAmount, " succesfully withdrawn $");
        } else {
            System.out.println("Not enough money to withdraw $" + withdrawAmount + " for " + Thread.currentThread().getName());
        }
    }

    private boolean isAccountBalanceEnough(int withdrawAmount) {
        return account.getBalance()>= withdrawAmount;
    }


    private void pauseExecution() {
        try {
            Thread.sleep(3000);
        } catch (Exception ignored) {
        }
    }

//    printing what is happening
    private void printActivity(int withdrawAmount, String activity) {
        System.out.println(Thread.currentThread().getName() + activity + withdrawAmount);
    }
}
