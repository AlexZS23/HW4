import java.lang.reflect.Array;
import java.util.Arrays;

public class SortMinToMax {

//    4. Write a program that sorts an array from minimum to maximum

    public static void main(String[] args) {

        int[] arr = {10, 20, -15, -52, 4, -20, 100, -80};
        int x;
        int dl = arr.length;

        for (int i = 1; i < dl; i++) {
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    x = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = x;
                }
            }
        } for (int i = 0; i < dl; i++){
            System.out.println(arr[i]);
        }


//        2й вариант (сортировка в массиве)
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

    }
}
