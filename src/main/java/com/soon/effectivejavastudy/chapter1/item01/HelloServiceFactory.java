package com.soon.effectivejavastudy.chapter1.item01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

//    public static HelloService of(String lang) {
//        if(lang.equals("ko")) {
//            return new KoreanHelloService();
//        } else {
//            return new EnglishHelloService();
//        }
//    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        HelloService ko = HelloService.of("ko");
        System.out.println(ko.hello());

        //Iterator - 어떤 구현체가 올지 모름
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();

        helloServiceOptional.ifPresent(h -> {
            System.out.println(h.hello());
        });

        HelloService helloService = new KoreanHelloService();
        System.out.println(helloService.hello());

        // reflection
        Class<?> aClass = Class.forName("com.soon.effectivejavastudy.chapter1.item01.KoreanHelloService");
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService1 = (HelloService) constructor.newInstance();
        System.out.println(helloService1.hello());
    }
}
