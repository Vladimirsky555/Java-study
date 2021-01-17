import java.util.*;

/*
1) Неупорядоченные - HashSet, нет гарантии в какой последовательности они выведутся. Случайный порядок.
2) Упорядоченные - LinkedHashSet, вывод в точной последовательности. Точный порядок.
3) Отсортированные - TreeSet, сортируется коллекция. Мы их отсортировали. Есть алгоритм сортировки.

При использовании HashSet необходимо переопределять методы Equals и Hashcode
Работает как обычный Map. Добавляемые объекты это набор ключей. Если ключ есть, то элемент не будет добавлен.

LinkeHashSet работает на основе LinkedHashMap. В конструкторе создаётся LinkedHashMap (связанный список)

TreeSet основан на TreeMap
 */
public class Main {
    public static void main(String[] args) {
        Set set = new HashSet();
        Set set2 = new LinkedHashSet();
        Set set3 = new TreeSet();

        set.add("1");
        set.add("3");
        set.add("8");
        set.add("2");
        set.add("3");

        for(Object o : set){
            System.out.println(o);
        }
    }
}
