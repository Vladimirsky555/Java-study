/*
Методы wait и notify в Object зачем нужны?
notify - сообщаем машине, что закончили
wait - машина ждёт, пока мы закончим

Мы создаём поток и запускаем. Подом ждём, чтобы вывести total.
Второй поток считает, затем по окончании рассчётов, уведомляет о завершении работы.

1) wait и notify используются из синхронизированного контекста, иначе выбросится
IllegalMonitorStateException
2) Оба метода синхронизированы на одном и том же объекте:
 synchronized (this)
 synchronized (threadB)
*/

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();

        synchronized (threadB){
            threadB.wait();
        }

        System.out.println(threadB.total);
    }

    static class ThreadB extends Thread {
        int total;

        @Override
        public void run() {
            synchronized (this){
                for (int i = 0; i < 5; i++) {
                    total += i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    notify();
                }
            }
        }
    }
}
