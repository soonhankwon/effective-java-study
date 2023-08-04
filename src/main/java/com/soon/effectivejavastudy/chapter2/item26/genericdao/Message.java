package com.soon.effectivejavastudy.chapter2.item26.genericdao;

public class Message implements Entity{

    private Long id;

    private String body;

    @Override
    public Long getId() {
        return this.id;
    }

    public String getBody() {
        return this.body;
    }
}
