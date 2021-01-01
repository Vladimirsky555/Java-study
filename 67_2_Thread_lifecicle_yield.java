
/*
Приоритет потоков 1-10, по умолчанию 5
myThread.setPriority(8); - назначаем приоритет потокам
MAX_PRIORITY = 1
NORM_PRIORITY = 5
MAX_PRIORITY = 10
Голодание потоков - если какокй-то поток в приоритете, то другим не хватает времени, какие-то ресурсы
могут быть заблокированы.
Метод yeld говорит scheduler, чтобы он запустил другой поток, так как этот поток завершил свою работу
(поток переходит из состояния Running в Runable).
Но гарантии все же нет, что поток будет выполнен вторым.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        //myThread.setPriority(Thread.MAX_PRIORITY);//10
        myThread.yield();//запусти другой поток, я подожду

        System.out.println("Name of Main thread: " + Thread.currentThread().getName());

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Name of other thread: " + Thread.currentThread().getName());
    }

}


