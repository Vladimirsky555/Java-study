import java.util.*;

/*
LinkedList то же самое, что и ArrayList, только методы синхронизированы (многопоточность)
Добавленные элементы получают индекс
Массив элементов, изначально капасити 10
Size увеличивается со временем
Вызывая конструктор без параметров - создаём массив с 10 элементами, но size = 0
ArrayList это обычный массив с обёрткой, которая увеличивает его capaсity
Быстро проходит пробегание по списку. Но при удалении приходится копировать весь массив.

LinkedList имплементирует очереди, имплементирует интерфейс List и имеет те же методы.
Это двунаправленный список. Это значит, что он добавляет элементы в начало и конец.
Пробегание долгое, но удаление быстро, всего лишь unlink. Но до удаляемого элемента нужно добраться

В итоге лучше использовать ArrayList.
LinkedList использовать для очередей. Очень быстро удаляется первый и последний элемент.
Поэтому в джаве начали имплементировать очереди к LinkedList
Также его можно использовать как стек и как очередь
 */

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();//массив
        List vector = new Vector();//массив синхронизированный
        List linked = new LinkedList();//двусвязный список (стеки, очереди)


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}