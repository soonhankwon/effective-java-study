package com.soon.effectivejavastudy.chapter1.item01;

public interface HelloService {

    String hello();

    static String bye() {
        prepareMessage();
        return "bye";
    }

    private static void prepareMessage() {
        // 내부적인 용도
    }

    default String hi() {
        prepareMessage();
        return "hi";
    }

//    interface 에선 public 간주
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
