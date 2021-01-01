import java.util.*;

/*
collections удобен тем, что можно превращать массив в коллекция и наоборот, сортировка.
Arrays также удобен наличием методов.
 */

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        for (int i = 0; i < 20; i++) {
            collection.add(i+23);
        }

        collection.remove(2);
        System.out.println(collection);

        //пробегаемся по коллекции
//        Iterator iterator = collection.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //работает на основе итераторов, лучше предыдущего
        for(Object o : collection){
            System.out.println(o);
        }




//        Collections collections;
//        Arrays arr;
    }
}
