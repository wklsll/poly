package com.wkl.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newFixedThreadPool（int  nThreads）创建一个固定大小、任务队列容量无界的线程池。核心线程数=最大线程数。
 * newCachedthreadPool（）创建一个大小无界的缓冲线程池。它的任务队列是一个同步队列。任务加入到线程池中，如果池中有空闲线程，则用空闲线程执行，如无则创建新线程执行。池中的线程空闲超过60秒，将被销毁释放。线程数随任务的多少变化。适用于执行耗时较少的异步任务。池的核心线程数=0，最大线程数=Integer.MAX_VALUE。
 * newSingleThreadExecutor（）只有一个线程来执行无界任务队列的单一线程池。该线程池确保任务按加入的顺序一个一个一次执行。当唯一的线程因任务异常中止时，将创建一个新的线程来继续执行后续任务。与newFixedThreadPool(1)的区别在于，单一线程池的池大小在newFixedThreadPool方法中硬编码，不能再改变的。
 * newScheduleThreadPool（int  corePoolSize）能定时执行任务的线程池。该池的核心线程数由参数指定，最大线程数=Integer.MAX_VALUE。
 */
public class TestThread {


    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        ExecutorService service1 = Executors.newCachedThreadPool();
        ExecutorService service2 = Executors.newSingleThreadExecutor();
        ExecutorService service3 = Executors.newScheduledThreadPool(2);
    }
}
