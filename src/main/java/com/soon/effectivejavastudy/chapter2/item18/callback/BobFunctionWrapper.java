package com.soon.effectivejavastudy.chapter2.item18.callback;

public class BobFunctionWrapper implements FunctionToCall{

    private BobFunction bobFunction;

    public BobFunctionWrapper(BobFunction bobFunction) {
        this.bobFunction = bobFunction;
    }

    @Override
    public void call() {
        this.bobFunction.call();
        System.out.println("coffee?");
    }

    @Override
    public void run() {
        this.bobFunction.run();
    }
}
