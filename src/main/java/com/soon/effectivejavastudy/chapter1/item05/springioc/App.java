package com.soon.effectivejavastudy.chapter1.item05.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpellChecker bean = applicationContext.getBean(SpellChecker.class);
        bean.isValid("test");
    }
}
