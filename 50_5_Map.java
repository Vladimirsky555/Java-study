import java.util.*;

/*
Объекты, которые являются ключами, должны переопределять
hashcode и eauals
Основные методы: put, get, size

Коллекции бывают 3-х типов
1) Неупорядоченные
2) Упорядоченные
3) Отсортированные
*/

class Book{
    String nameAuthor;

    public Book(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    //переопределяем toString
    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1", "Dan Brown");
        map.put("2", new Book("Karnegi"));
        map.put("3", "Jack London");

        System.out.println(map.get("2"));

        //Пробегаемся по коллекции
        Set set = map.entrySet();
        for(Object o : set){
            System.out.println(o);
        }

        //пробегаемся по ключам
        Set keySet = map.keySet();
        for(Object o : keySet){
            System.out.println(o);
        }
    }
}
