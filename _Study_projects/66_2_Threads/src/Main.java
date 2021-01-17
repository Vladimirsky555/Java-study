/*
Поток запускается только методом start
После завершения поток второй раз запустить нельзя
 */

public class Main {
    public static void main(String[] args) throws Exception {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("Name of Main thread: " + Thread.currentThread().getName());

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread name is " + Thread.currentThread().getName()
            + " i = " + i);
        }
    }
}

