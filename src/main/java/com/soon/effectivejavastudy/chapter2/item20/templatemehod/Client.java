package com.soon.effectivejavastudy.chapter2.item20.templatemehod;

public class Client {

    public static void main(String[] args) {
        FileProcessor fileProcessor = new Plus("number.txt");
        System.out.println(fileProcessor.process(Integer::sum));
    }
}
