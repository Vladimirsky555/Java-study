import java.io.*;
import java.util.*;

/*
Пример полиморфизма - 3
super - вверх по иерархии
extend - вниз по иерархии

Итак, дженерики в основном используются в коллекциях
Не может быть статического дженерик-типа
Мы не можем создать дженерик-массив

Методы, принимающие эти списки могут либо extends, либо super
extends - можем пробегаться, но не добавлять
super - можем добавлять любые дочерние классы и пробегаться по нему
 */

class Parent{
    void method(){
        System.out.println("parent");
    }
}

class Child extends Parent{
    void method(){
        System.out.println("child");
    }
}

class Son extends Child {
    void method(){
        System.out.println("son");
    }
}

public class Main <T extends Main & Comparable & Serializable>{


    public static void main(String[] args) throws Exception{

        //List<Son> list = new ArrayList<>(); не принимает
        //List<Parent> list = new ArrayList<>(); //принимает
        //List<Child> list = new ArrayList<>();//принимает
        List<Object> list = new ArrayList<>();//принимает
        list.add(new Parent());
        list.add(new Parent());
        list.add(new Parent());

        Main main = new Main();
        main.method(list);
    }

    //Как вызвать методы класса Parent
    void method(List<? super Child> list){//можно передать всё что выше по иерархии
        //можно добавлять данные других классов ниже Parent по иерархии
        list.add(new Son());
        list.add(new Child());

        for(Object o : list){
            Parent p = (Parent)o;
            p.method();
        }
    }






}