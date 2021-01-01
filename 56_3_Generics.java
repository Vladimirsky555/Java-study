import java.io.*;
import java.util.*;

/*
Дженерик-классы class MyClass <T>{}
Переменные типа T

Проблема в том, что мы не знаем какой будет класс, поэтому не можем
ничего сделать с ним.
 */

class Car{

}

public class Main <T>{

    T var;

    public static void main(String[] args) {
        //Main<String> main = new Main<>();//переменная T типа String
        Main<Car> main = new Main<>();
        //main.var = "var";
        System.out.println(main.var);
        //main.<String>method("123");
    }


    T method(T type){
        System.out.println(type);
        return type;
    }
}