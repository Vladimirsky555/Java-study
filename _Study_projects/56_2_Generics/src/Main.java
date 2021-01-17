import java.io.*;
import java.util.*;

/*
Дженерик-классы class MyClass <T>{}
Переменные типа T
 */

public class Main <T, U, K>{

    T var;
    U u;
    K k;

    public static void main(String[] args) {
        Main main = new Main();
        main.<String>method("123");
    }


    T method(T type){
        System.out.println(type);
        return type;
    }
}