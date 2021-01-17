import javax.swing.*;
import java.util.*;

/*
Vector и Hashtable - прошлый век
List list = Collections.synchronizedList(new ArrayList<>()); - делает все методы синхронизированными

Возможна ситуация, когда один поток выполнил проверку if(list.size() > 0),
но тут заходит второй поток и выполняет ту же проверку, достаёт строку.
Второй поток, думая, что строка есть, пытается её получить и выполняется эксепшен.

Поэтому решением является синхронизация метода удаления элемента
Поэтому можно было обойтись и обычным списком, несинхронизированным

Зачем тогда синхронизированные списки? Чтобы возвращать их. Если мы шарим списки между потоками,
то можно использовать синхронизированные списки.
 */

public class Main {


    public static void main(String[] args) throws Exception{
        NameList nameList = new NameList();
        nameList.add("first");

        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println(nameList.removeFirst());
            }
        }
        MyThread myThread = new MyThread();
        myThread.setName("one");
        myThread.start();
        new MyThread().start();
    }

    static class NameList{
        //Массив с синхронизированными методами
//        private List list = Collections.synchronizedList(new ArrayList<>());
        private List list = new ArrayList();

        public synchronized void add(String name){
            list.add(name);
        }

        //Возвращать лучше синхронизированный лист
        public List getList() {
            return list;
        }

        //public String removeFirst(){
        public synchronized String removeFirst(){
            if(list.size() > 0){
                //Передаём управление другому потоку
                if(Thread.currentThread().getName().equals("one")){
                    Thread.yield();
                }
                return (String)list.remove(0);
            }
            return null;
        }
    }
}
