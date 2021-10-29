package test.model;



import model.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getBalanceTest() {

//        when
        Account account = new Account(7000);

//        given
        account.withdraw(2000);

//        then
        assertEquals(5000, account.getBalance());
        assertNotEquals(1000, account.getBalance());
    }
}