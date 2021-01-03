import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Запускаем 1-й поток, он начинает выполняться, лочит ресурс.
Начинает выполняться 2-й поток, ресурс занят. 2-й поток будет ждать ресурс, всё это время
выводит waiting. Как только 1-й поток завершит свою работу, то lock освободится и 2-й
поток начнёт свою работу.
*/

public class Main {
    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            lock.lock();
            System.out.println(getName() + " start working");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + " stop working");
            lock.unlock();
            System.out.println("lock is released");
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            System.out.println(getName() + " begin working");
            while(true){
            if(lock.tryLock()){
                System.out.println(getName() + " working");
                break;
                 } else {
                System.out.println(getName() + " waiting");
            }
            }
        }
    }
}
