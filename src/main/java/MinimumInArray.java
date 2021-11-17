public class MinimumInArray {

//    3. Write a program that finds the minimum value in an array

    public static void main(String[] args) {

        int[] arr = {10, 20, -15, -52, 4, -20};
        int minimum = arr[0];
        int dl = arr.length;

        for (int i = 1; i < dl; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        } System.out.println(minimum);

    }
}

