import java.util.*;

/*
Коллекции бывают 3-х видов:
1) Неупорядоченные - HashSet, нет гарантии в какой последовательности они выведутся. Случайный порядо.
2) Упорядоченные - LinkedHashSet, вывод в точной последовательности. Точный порядок.
3) Отсортированные - TreeSet, сортируется коллекция. Мы их отсортировали. Есть алгоритм сортировки.
*/



public class Main {
    public static void main(String[] args) {

        //Collection collection = new HashSet();
        //Collection collection = new LinkedHashSet();
        Collection collection = new TreeSet();
        collection.add(3);
        collection.add(1);
        collection.add(2);


        for (Object o : collection) {
            System.out.println(o);
        }


    }
}
