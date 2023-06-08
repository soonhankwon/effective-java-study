package com.soon.effectivejavastudy.chapter1.item01;

public interface HelloService {

    String hello();

//    interface 에선 public 간주
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
