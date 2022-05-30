package base;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author hucc
 * 2022/2/24 11:09
 */
public class ThreadExample {

//    private int cnt = 0;

    private final AtomicInteger cnt = new AtomicInteger(0);

    public void add() {
//        cnt++;
        cnt.addAndGet(1);
    }
    
    public int get() {
//        return cnt;
        return cnt.get();
    }

    public static void main(String[] args) throws InterruptedException {
        final int threadSize = 1000;
        ThreadExample example = new ThreadExample();
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                example.add();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();

        System.out.println(example.get());
    }

}
