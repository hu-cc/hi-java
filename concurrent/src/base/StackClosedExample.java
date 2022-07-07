package base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author hucc
 * 2022/5/30 22:33
 */
public class StackClosedExample {

    private int add100() {
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        StackClosedExample example = new StackClosedExample();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> System.out.println(example.add100()));
        executorService.execute(() -> System.out.println(example.add100()));
        executorService.shutdown();
    }

}
