import java.util.*;

/*
Set - коллекция неповторяющихся объектов
Можно использовать при извлечении из базы данных,
чтобы сформировать список неповторящихся объектов
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Set set = new HashSet();

        //Дважды добавляем одни и те же элементы в set
        for (int i = 0; i < 5; i++) {
            set.add(i+1);
        }
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        //в итоге получаем один элемент
        for(Object o : set){
            System.out.println(o);
        }




    }







}
