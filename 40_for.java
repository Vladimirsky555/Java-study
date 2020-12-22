public class Main {
    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5};

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        int i = 0;
//        for (System.out.println("First statement"); i < arr.length; System.out.println("end"),i++) {
//            System.out.println(arr[i]);
//        }

//        for (System.out.println("First statement"); i < arr.length; System.out.println("end"),i++)
//            System.out.println(arr[i]);

        //Помещает в переменную i все значения массива arr
      for(int i : arr){
          System.out.println(i);
      }
 
    }
}
