import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
//        List listA = new ArrayList();
//        listA.add("5");
//        System.out.println(listA);

        //Обычный int мы не можем запихнуть в массив.
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(4);

        for (int k : list){
            System.out.println(k);
        }
    }
}
