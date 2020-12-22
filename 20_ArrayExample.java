import java.util.Arrays;

public class ArrayExample {

   static int[] arr = {5, 4, 3, 8};
   double [] arr2 = {4.34, 5.57};
   int [][] array = {{5,5}, {6,8}, {9,4}};
    int [] array2[] = {{5,5}, {6,8}, {9,4}};
    int array3[][] = {{5,5}, {6,8}, {9,4}};


    public static void main(String[] args){
        for(int i = 0; i < 4; i++){
            System.out.println(arr[i]);
        }
    }
}
