import java.util.*;


/*
Очереди простой класс, всего 6 методов
LinkedList имплементирует List и Queue. Это двухсвязанный список.
Он имплементирует все методы Queue. У него есть add, offer (вызывает метод add)
peek - возвращает текущий элемент
pool - возвращает текущий элемент и делает ему unlink (удаление)

PriorityQueue - отсортированная очередь (массив)
Это обычный список объектов очередь. Add вызывает offer. Он добавляет элемент
в очередь последовательно. Но при этом происходит сортировка.
При нехатке элементов увеличивает grow.
Отличие в методе shiftUp. Если есть компаратор, то используется он.
То есть каждый раз при добавлении элемента он отсортировывает его
То есть главное чтобы элементы были Comparable или передаём Comparator
Компаратор передаём через конструктор.
Класс String по умолчанию имплементирует Comparable
 */

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();//двусвязный список
        Queue queue1 = new PriorityQueue();//на основании массивов

        queue.add("1");
        queue.add("3");
        queue.add("2");

        //Как отсортировать LinkedList
        //+ сортировка один раз
        //- пишем лишний код, добавляем сортировку
        List list = (List)queue;//Преобразовываем к List
        Collections.sort(list);//передаём лист в Collections

        while(queue.size() > 0){
            System.out.println(queue.poll());
        }
    }


}
