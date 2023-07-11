package com.soon.effectivejavastudy.chapter1.item08.autoclosable;

public class App {

    public static void main(String[] args) {
        try(AutoClosableIsGood good = new AutoClosableIsGood()) {
            // TODO resource close
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
