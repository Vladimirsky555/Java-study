/*
Executor имеет один метод, который может выполнить один поток
ExecutorService предоставляет больше возможностей

Когда потоков слишком много, приложение может упасть, создание потоков
требует ресурсов. Экзекьюторы создают пул потоков.

        Executor executor;

        создание одного потока, который будет возвращаться
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Создание 10 потоков
        ExecutorService executorService1 = Executors.newFixedThreadPool(10);

        Создание потоков по необходимости. Если не используется в течение 60 секунд, то умирает
        В теч 60 сек его можно переиспользовать
        ExecutorService executorService3 = Executors.newCachedThreadPool();
 */

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(new MyRunnable());
        System.out.println(executorService.submit(new MyCallable()).get());
        executorService.shutdown();//завершаем потоки после их завершения
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("MyRunnable");
        }
    }

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "MyCallable";
        }
    }


}
