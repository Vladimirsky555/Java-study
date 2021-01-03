/*
thread.start - помещает поток в пул, но не гарантирует очерёдность выполнения
 */

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Name of Main thread: " + Thread.currentThread().getName());

        MyRunnable mr = new MyRunnable();
        Thread thread2 = new Thread(mr);//mr передаём в конструктор
        thread2.start();
        //mr.run();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("This is new thread");
//        someMethod();
        System.out.println("Name of other thread: " + Thread.currentThread().getName());
    }

    private void someMethod(){
        throw new RuntimeException();
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Name of Runnable thread: " + Thread.currentThread().getName());
    }
}