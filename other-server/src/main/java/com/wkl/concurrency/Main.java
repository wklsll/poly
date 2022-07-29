package com.wkl.concurrency;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class Main {

    public static volatile int count = 0;
    public static int threadPool = 1;
    public static int clientTotal = 5000;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(200);
        final Semaphore semaphore = new Semaphore(threadPool);
        CountDownLatch countDownLatch  =new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            executor.execute(() -> {
                try {
                   // semaphore.acquire();
                  //  add();
                    //semaphore.release();
                    countDownLatch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
        executor.shutdown();
        countDownLatch.await();
      //  Thread.sleep(3000);
        log.info("count为：" + count);
    }

}
