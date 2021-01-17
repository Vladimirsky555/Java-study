/*
Проблема может быть в том, что при выполнении int i = this.i; одним потоком, он оборвётся и
второй поток также выполнит int i = this.i; Таким образом у двух потоков будет одно и то же
значение переменной. И в итоге результат будет 6, а не 7, как мы ожидаем.

public synchronized void changeI() - синхронизированный метод не должен прерываться (lock)

Мы синхронизируем объект, который используется разными потоками
*/

public class Main {
    public static void main(String[] args) throws Exception{
        Resource resource = new Resource();
        resource.setI(5);

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
    }
}

class Resource{
    private int i;

    public int getI() {
        return i;
    }

//    public synchronized void setI(int i) {
public void setI(int i) {
        this.i = i;
    }

    //public void changeI(){
//    public synchronized void changeI(){
//        int i = this.i;
//        if(Thread.currentThread().getName().equals("one")){
//            Thread.yield();//даже если поток отходит, давая место другим, другие не займут его место,
//                           //так как метод синхронизирован
//        }
//        i++;
//        this.i = i;
//    }

    //Работает так же
    public void changeI(){
        synchronized (this){
            int i = this.i;
            if(Thread.currentThread().getName().equals("one")){
                Thread.yield();
            }
        }
        i++;
        this.i = i;
    }
}
