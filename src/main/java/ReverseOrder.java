public class ReverseOrder {

//    2. Program to print the elements of an array in reverse order
//    In this program, we need to print the elements of the array in reverse order that is; the last element should be
//    displayed first, followed by second last element and so on.
//
//    Program to print the elements of an array in reverse order
//    int[] = {1, 2, 3, 4, 5}
//    OR
//            String[] = {"one", "two", "three", "four"}

    public static void main(String[] args) {

        int[] reverse = {1, 2, 3, 4, 5};
        int count = reverse.length;

        while (count > 0){
            System.out.println(reverse[count - 1]);
            count--;
        }



    }
}
