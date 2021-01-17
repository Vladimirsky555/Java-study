/*
Жизненный цикл потока
1) New - создание
2) Runable - зарегистрирован и попадает в пул потоков
3) Running - поток выполняется
4) Waiting, Blocking, Sleeping - вызов метода wait и block. Далее в пул (Runable) и ожидает вызова.
 */

/*
thread.start - помещает поток в пул, но не гарантирует очерёдность выполнения
thtead.sleep - если нужно выполнить другие потоки ранее, например главный
sleep - помещаем в try-catch, для возможности использования myThread.interrupt(); - чтобы
не ожидать секунду, а вызвать поток ранее
 */

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        try {
            Thread.sleep(1000);//чтобы вывести thread-0 первым
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Name of Main thread: " + Thread.currentThread().getName());

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Name of other thread: " + Thread.currentThread().getName());
    }

}


