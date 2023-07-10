package com.soon.effectivejavastudy.chapter1.item07.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceExample {

    public static void main(String[] args) throws InterruptedException {
        BigObject strong = new BigObject();
        ReferenceQueue<BigObject> rq = new ReferenceQueue<>();

        BigObjectReference<BigObject> phantom = new BigObjectReference<>(strong, rq);
//        PhantomReference<BigObject> phantom = new PhantomReference<>(strong, rq);
        strong = null;

        System.gc();
        Thread.sleep(3000L);

        // phantom -> 죽었지만 사리지지 않고 큐에 들어간다.
        System.out.println(phantom.isEnqueued());

        Reference<? extends BigObject> reference = rq.poll();
        BigObjectReference bigObjectCleaner = (BigObjectReference) reference;
        bigObjectCleaner.cleanUp();
        reference.clear();
    }
}
