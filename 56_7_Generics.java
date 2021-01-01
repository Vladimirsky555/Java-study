import java.io.*;
import java.util.*;

/*
Ограничения:
1) Не может быть статических полей
2) Нельзя создать массив списков
3) Невозможно создать другой тип, даже если он унаследован от родительского

Пример полиморфизма - 1
 */

//class Parent<T>{
class Parent{
    //static T t;не можем создать статические поля в дженериках
}

class Child extends Parent{

}

public class Main <T extends Main & Comparable & Serializable>{


    public static void main(String[] args) throws Exception{

        List<Parent> list = new ArrayList<>();
        list.add(new Parent());
        list.add(new Child());
        List<Child> [] l;//мы не можем создать массив списков
        Main main = new Main();
        main.method(list);

        for(Parent parent : list){
            System.out.println(parent);
        }
    }

    void method(List<Parent> list){
//        list.add(new Main());
    }






}