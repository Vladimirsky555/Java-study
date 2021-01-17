/*
Машина вызывает wait и отдыхает. Как что напишете, уведомите меня и я это выведу.
Сканер считывает строчки, и как только пришла новая, уведомляет машину.

wait освобождает лог
notify не освобождает лог,
*/

import java.util.*;


public class Main {

    static List<String> strings = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws InterruptedException{
        new Operator().start();
        new Machine().start();
    }

        //Оператор вводит информацию
        //Читаем из консольной строки с помощью сканера
        static class Operator extends Thread {
        Scanner scanner = new Scanner(System.in);
            @Override
            public void run() {
                while (true){
                    synchronized (strings){
                        strings.add(scanner.nextLine());
                        strings.notify();
                    }

                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        //Машина
        static class Machine extends Thread {
            @Override
            public void run() {
                while (strings.isEmpty()){
                    synchronized (strings){
                        try {
                            strings.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //Выводим и удаляем последний элемент
                        System.out.println(strings.remove(0));
                    }
                }
            }
        }
    }


