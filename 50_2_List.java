import java.util.*;

/*
List - коллекция на основе индексов
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        //Наследники Collection
        List list = new ArrayList();
        Set set = new HashSet();
        Queue queue = new PriorityQueue();

        //Собственный интерфейс (относится к коллекциям)
        Map map = new HashMap();

        //List
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

//        main.runList(list);

        list.set(2, 333);//меняем 2-й элемент
//        main.runList(list);

        list.add(1,6);
        main.runList(list);
    }




    void runList(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
