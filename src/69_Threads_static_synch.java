/*
Не стоит совмещать синхронизацию статическую и обычную, либо одно, либо другое
Статическая синхронизация - на уровне класса synchronized (Resource.class)
Обычная синхронизация - на уровне объекта synchronized (this)
*/

public class Main {
    public static void main(String[] args) throws Exception{
        Resource.i = 5;

        MyThread myThread1 = new MyThread();
        myThread1.setName("one");
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        System.out.println(Resource.i);
    }
}

class MyThread extends Thread{
    Resource resource;
    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        Resource.changeStaticI();//статический метод
        new Resource().changeI();//обычный метод
    }
}

class Resource{
    static int i;

//    public static synchronized void changeStaticI(){
//        int i = Resource.i;
//        if(Thread.currentThread().getName().equals("one")){
//            Thread.yield();
//        }
//        i++;
//        Resource.i = i;
//    }

    //тот же код
    public static void changeStaticI(){
        synchronized (Resource.class) {
            int i = Resource.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            Resource.i = i;
        }
    }

    public void changeI(){
        synchronized (this){
            int i = Resource.i;
            if(Thread.currentThread().getName().equals("one")){
                Thread.yield();
            }
        }
        i++;
        Resource.i = i;
    }
}
