package com.soon.effectivejavastudy.chapter2.item18.callback;

public class BobFunction implements FunctionToCall{
    private final Service service;

    public BobFunction(Service service) {
        this.service = service;
    }

    @Override
    public void call() {
        System.out.println("eat?");
    }

    @Override
    public void run() {
        this.service.run(this);
    }
}
