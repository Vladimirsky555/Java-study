import java.io.*;
import java.util.*;

/*
Хранение данных в Обобщённых классах
 */



public class Main <T extends Main & Comparable & Serializable>{


    public static void main(String[] args) throws Exception{

        List<File> list = new ArrayList<>();
        Main main = new Main();
        main.method(list);

        for(File o : list){
            File f = o;
        }
    }

    void method(List<File> list){
//    void method(List list){
        //list.add(new Main());
    }

    //T существует на этапе компиляции.
    //После компиляции T заменяется на Jbject
    //То есть дженерики работают на уровне компиляции
class myClass<T>{
    T t;
    T method(T t){
        return t;
    }

}



}