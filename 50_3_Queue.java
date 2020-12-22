import java.util.*;

/*
Queue - очередь
offer - добавление
poll - извлечение и удаление элемента
peek - извлечение элемента, но не удаление
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Queue queue = new PriorityQueue();//также LinkedList (ещё одна имплементация)

        for (int i = 0; i < 5; i++) {
            queue.offer(i+1);
        }
        //main.runPeek(queue);//один и тот же элемент
        //main.runPoll(queue);//будут удаляться, работает некорректно

        //Правильно через итератор
        Iterator iterator = queue.iterator();
        main.runIterator(iterator, queue);
        System.out.println("num of elements - " + queue.size());

    }




    void runPeek(Queue queue){
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.peek());
        }
    }

    void runPoll(Queue queue){
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.poll());
        }
    }

    void runIterator(Iterator iterator, Queue queue){
        while (iterator.hasNext()){
            //System.out.println(iterator.next());//элементы не удалятся
            System.out.println(queue.poll());//элементы удалятся
        }
    }


}
