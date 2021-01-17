/*
Код 68 урока
Ни один другой поток не сможет запустить код, который мы лочим, пока текущий поток
не дойдё до lock.unlock();

Зачем это нужно? Более гибкий вид синхронизации. Например, нужно менять не только одну переменную, но
и вторую. В таком случае лочим один метод, а анлок помещаем во 2-й.

Залоченный код выполняется только одним потоком.
*/


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws Exception{
        Resource resource = new Resource();
        resource.setI(5);
        resource.j = 5;
        MyThread myThread1 = new MyThread();
        myThread1.setName("one");
        MyThread myThread2 = new MyThread();
        myThread1.setResource(resource);
        myThread2.setResource(resource);
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println(resource.getI());
        System.out.println(resource.j);
    }
}

class MyThread extends Thread{
    Resource resource;
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
//        resource.changeJ();
    }
}

class Resource{
    private int i;
    int j;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    Lock lock = new ReentrantLock();//работает также как и синхронизация

    void changeI(){
        lock.lock();
        int i = this.i;
        if(Thread.currentThread().getName().equals("one")){
            Thread.yield();
        }
        i++;
        this.i = i;
        changeJ();
    }

    void changeJ(){
        int j = this.j;
        if(Thread.currentThread().getName().equals("one")){
            Thread.yield();
        }
        j++;
        this.j = j;
        lock.unlock();
    }

}
