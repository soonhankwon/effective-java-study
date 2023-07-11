package com.soon.effectivejavastudy.chapter1.item08.finalizer_attack;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class AccountTest {

    @Test
    void generalAccount() {
        Account account = new Account("soon");
        account.transfer(BigDecimal.valueOf(10.4), "hello");
    }

    @Test
    void bad_account() throws InterruptedException {
        Account account = null;
        try {
            account = new BrokenAccount("푸틴");
        } catch (Exception e) {
            System.out.println("what's going on");
        }

        System.gc();
        Thread.sleep(3000L);
    }
}