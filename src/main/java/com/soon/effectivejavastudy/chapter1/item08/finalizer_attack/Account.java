package com.soon.effectivejavastudy.chapter1.item08.finalizer_attack;

import java.math.BigDecimal;

// 1. final 로 상속을 막아서 방어
public class Account {

    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;

        if(accountId.equals("푸틴")) {
            throw new IllegalArgumentException("no war!");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }

    // final 로 오버라이딩 불가로 방어
    @Override
    protected final void finalize() throws Throwable {
        super.finalize();
    }
}
