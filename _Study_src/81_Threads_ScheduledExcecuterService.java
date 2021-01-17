/*
Для выполнения задач через определённое время многопоточно, можно использовать
ScheduledExecutorService
 */

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        s.schedule(new MyThread(), 3, TimeUnit.SECONDS);
        s.shutdown();
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
