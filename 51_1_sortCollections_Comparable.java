import java.util.*;

/*
Примитивные типы сами сортируются, у них есть имплементация.
Integer уже имплементирует интерфейс Comparable.
Если нам нужно отсортировать по возрасту, имени, то имплементируем интерфейс
Comparable

Если нет доступа к интерфейсу Comparable
 */

class Person implements Comparable<Person>{
    int age;

    public Person(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Person p){
        return this.age - p.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}



public class Main {
    public static void main(String[] args) {
        Set set = new TreeSet();
//        set.add("3");
//        set.add("1");
//        set.add("2");
//        set.add("7");

        set.add(new Person(4));
        set.add(new Person(3));
        set.add(new Person(1));
        set.add(new Person(2));

        for(Object o : set){
            System.out.println(o);
        }


    }
}
