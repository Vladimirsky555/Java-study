/*
Volatile чтобы переменные не кешировались и писались в память
volatile - значит не кешировать эту переменную, а использовать как есть.
Без этого слова второй поток не работает, так как не отслеживает изменения этой
переменной первым потоком
То есть читают и пишут потоки переменную в одно и то же место, а не кешируют у себя

Использование: несколько потоков читают переменную и один поток пишет
 */

public class Main {

    volatile static int i;

    public static void main(String[]args){
        new MyThreadRead().start();
        new MyThreadWrite().start();
    }

    static class MyThreadWrite extends Thread{
        @Override
        public void run() {
            while(i < 5 ) {
                System.out.println("increment i to" + (++i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //Выводим значение i, если она поменялась
    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int localVar = i;
            while(localVar < 5){
                if(localVar != i){
                    System.out.println("new value of i is " + i);
                    localVar = i;
                }
            }
        }
    }
}
