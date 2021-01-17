import java.io.*;
import java.util.*;

/*
Решение проблемы того, что с обобщёнными классами и методами мало что можно сделать
Main идёт первым.
Мы можем заэкстендить только один класс, который идёт первым. И сколько угодно
интерфейсов
 */

class Car extends Main implements Comparable, Serializable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Main <T extends Main & Comparable & Serializable>{

    T var;

    public static void main(String[] args) throws Exception{
        Main<Car> main = new Main<>();
        System.out.println(main.var);
        main.method(new Car());
    }

    T method(T type){
        type.someMethod();
        type.compareTo(new Object());//появился ещё один метод для сравнения
        System.out.println(type);
        return type;
    }

    void someMethod(){
        System.out.println("bla");
    };



}