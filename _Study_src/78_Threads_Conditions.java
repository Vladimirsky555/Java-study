/*
Аналог использования wait и notify
Принято с локами использовать кондишены.

Например у нас есть счёт, значение которого не может быть меньше 0.
мы можем его уменьшать и увеличивать.
condition.await() - ожидание пока другие потоки увеличат значение, чтобы выполнить этот поток

С помощью кондишенов сигнализируем и ждём наступления некоторых условий. 
*/

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Main {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account;

    public static void main(String[] args) throws InterruptedException {
        new AccountMinus().start();
        new AccountPlus().start();
    }

    static class AccountPlus extends Thread {
        @Override
        public void run() {
            lock.lock();
            account += 10;
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread {
        @Override
        public void run() {
            if(account < 10){
                try {
                    lock.lock();
                    System.out.println("account = " + account);
                    condition.await();
                    System.out.println("account = " + account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            account -= 10;
            System.out.println("account at the end = " + account);
        }
    }
}
