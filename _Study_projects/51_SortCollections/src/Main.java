import java.util.*;

/*
Примитивные типы сами сортируются, у них есть имплементация.
Integer уже имплементирует интерфейс Comparable.
Если нам нужно отсортировать по возрасту, имени, то имплементируем интерфейс
Comparable

Если нет доступа к интерфейсу Comparable, то
1) создаём новый класс,
2) который имплементируем от Comparator
3) Передаём его в нашу коллекцию
 */

class Person{

    private int age;

    public int getAge() {
        return age;
    }

    public Person(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class ComparePerson implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}



public class Main {
    public static void main(String[] args) {
        Set set = new TreeSet(new ComparePerson());//передаём в коллекцию наш класс ComparePerson

        set.add(new Person(4));
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(2));

        for(Object o : set){
            System.out.println(o);
        }


    }
}
