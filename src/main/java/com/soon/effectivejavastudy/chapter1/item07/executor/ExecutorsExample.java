package com.soon.effectivejavastudy.chapter1.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfCpu = Runtime.getRuntime().availableProcessors();

//        ExecutorService service = Executors.newFixedThreadPool(numberOfCpu);
        ExecutorService service = Executors.newCachedThreadPool();

        Future<String> submit = service.submit(new Task());
        System.out.println(Thread.currentThread() + " hello");

        // blocking call
        System.out.println(submit.get());

        service.shutdown();
    }

    static class Task implements Callable<String> {
//        @Override
//        public void run() {
//            try {
//                Thread.sleep(2000L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println(Thread.currentThread() + " world");
//        }


        @Override
        public String call() throws Exception {
            Thread.sleep(2000L);
            return Thread.currentThread() + " world";
        }
    }
}
