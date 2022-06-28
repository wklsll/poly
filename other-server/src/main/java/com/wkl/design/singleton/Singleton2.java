package com.wkl.design.singleton;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单例模式
 * 懒汉式
 */
@Slf4j
public class Singleton2 {
    // 加volatile的原因，保证其顺序执行，即volatile保证有序性

    //  singleton2 = new Singleton2 并不是原子性操作，它分为3步
    // 1、给singleton2分配内存 2、调用Singleton2的构造函数来初始化 3、将 singleton2对象指向分配的内存空间（singleton2指向内存空间后，singleton2就不为null了）
    // 在JVM中的及时编译存在指令重排序的优化，也就是说不能保证1,2,3执行的顺序，最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是 1-3-2，则在 3 执行完毕、2 未执行之前，
    // 被线程二抢占了，这时 instance 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
    //　通过添加volatile就可以解决这种报错，因为volatile可以保证1、2、3的执行顺序，没执行玩1、2就肯定不会执行3，也就是没有执行完1、2instance一直为空，具体代码如下：

    private static volatile Singleton2 singleton2 = null;


    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (singleton2 == null) {
            synchronized (Singleton2.class) {
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10000);
        for (int i = 0; i < 300000000; i++) {
            int finalI = i;
            executor.execute(() -> {
                boolean equals = Singleton2.getInstance().equals(Singleton2.getInstance());
                // log.info("{}", finalI);
                if (!equals) {
                    log.info("{}", finalI);
                    //log.info(i);
                }
            });
        }
        log.info("=======");
        //executor.shutdown();

    }


}
