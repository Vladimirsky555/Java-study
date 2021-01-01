import java.io.*;
import java.util.*;

/*
Пример полиморфизма - 2
 */

class Parent{

}

class Child extends Parent{

}

class Son extends Parent {

}

public class Main <T extends Main & Comparable & Serializable>{


    public static void main(String[] args) throws Exception{

        List<Child> list = new ArrayList<>();
        list.add(new Child());
        list.add(new Child());
        list.add(new Child());

        Main main = new Main();
        main.method(list);


    }
    void method(List<Parent> list){//так работает
        // void method(List<?> list){ то же, что и ниже на строчку
         //void method(List<? extends Object> list){
   // void method(List<? extends Parent> list){//всё что наследуется от Parent мы можем сюда передать
                                               //но добавить ничего не получится
        for(Parent parent : list) {
            System.out.println(parent);
        }

        list.add(new Parent());
        for(Parent parent : list){
            System.out.println(parent);
        }

        list.add(new Son());
        for(Parent parent : list){
            System.out.println(parent);
        }

             for(Object o : list){
                 System.out.println(o);
             }
    }






}