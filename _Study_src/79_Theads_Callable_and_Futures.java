import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
Чтобы не только запустить некую задачу, но и вернуть результат, используется интерфейс Callable
get зависнет, аналог join
Как только результат будет получен, он будет выведен.

public class FutureTask<V> implements RunnableFuture<V>
public interface RunnableFuture<V> extends Runnable, Future<V>

Runnable можем поместить в thread потому, что есть интерфейс Runnable

Вывод: с помощью интерфейса Callable мы можем запустить поток в методе call
 */

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }

    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int j =0;
            for (int i = 0; i < 10; i++,j++) {
                Thread.sleep(300);
            }
            return j;
        }
    }
}
