/*
Задача: мы хотим выполнить сначала thread-0, а потом main. В таком случае нам нужно
заджойнить поток - то есть убить его фактически
sleep и yield выполняются для текущего потока
 */

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();//main ждёт выполнения thread-0
        System.out.println("Name of Main thread: " + Thread.currentThread().getName());
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}


