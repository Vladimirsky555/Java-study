import java.io.*;
import java.util.*;

/*
Решение проблемы того, что с обобщёнными классами и методами мало что можно сделать
 */

class Car implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Main <T extends Comparable>{

    T var;

    public static void main(String[] args) {
        Main<Car> main = new Main<>();
        System.out.println(main.var);
    }


    T method(T type){
        type.compareTo(new Object());//появился ещё один метод для сравнения
        System.out.println(type);
        return type;
    }
}