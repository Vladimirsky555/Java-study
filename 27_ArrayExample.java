/*
Три способа инициализации массивов:
1) int[]arr = new int[10];
2) int[]arr = new int[3]{5,7,8};
3) int[]arr = {1,67,78};
 */

public class ArrayExample {
    public static void main(String[] args) {
        int[]arr = new int[10];
        Object[] obj = new Object[10];

        //Инициализация массива объектов или одномерного массива
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i + 100;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//            System.out.println(obj[i]);
//        }

        //Инициализация двухмерного массива
//        int[][]j = new int[3][];
//        int[]k = new int[5];
//        j[0] = k;
//
//        for (int l = 0; l < j[0].length; l++) {
//            System.out.println(j[0][l]);
//        }

        //Анонимное создание массива
//        int [] s = new int[]{4,5,6};
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }

    method(new int[]{1,2,8,9,34});//передача значений в анонимный массив

        //Еще один способ инициализации
        int[]g = {1,67,78};
        method(g);

    }

    //метод для вывода анонимного массива
    static void method(int[]k){
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
    }
}
