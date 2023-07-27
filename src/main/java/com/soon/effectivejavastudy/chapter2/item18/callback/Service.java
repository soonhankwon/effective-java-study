package com.soon.effectivejavastudy.chapter2.item18.callback;

public class Service {

    public void run(FunctionToCall functionToCall) {
        System.out.println("wait");
        //callback
        functionToCall.call();
    }

    public static void main(String[] args) {
        Service service = new Service();
        BobFunction bobFunction = new BobFunction(service);
        //self problem
        BobFunctionWrapper bobFunctionWrapper = new BobFunctionWrapper(bobFunction);
        bobFunctionWrapper.call();
    }
}
