import java.io.*;
import java.util.*;

/*
Обобщённые методы. Можно передать любой класс.
Дженерик-методы - возвращают любые типы

Дженерик-классы class MyClass <T>{}
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.<String>method("123");
        // main.<Integer> method(123);
        // main.method(123);
        // main.method(new Main());

    }

//    <T> T method(T type){
//        System.out.println(type);
//        return type;
//    }

    //Также дженерик
//    <T> void method(String s){
//        System.out.println(s);
//    }

//        <T, U, K> T method(T type, U u, K k){
//        System.out.println(type);
//        return type;
//       }


    <T> T method(T type){
        System.out.println(type);
        return type;
    }
}
