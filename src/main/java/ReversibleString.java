import java.util.Scanner;

public class ReversibleString {

//    5. Write a program that outputs a reversible string (use an array of characters - char string [])

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите предложение для преобразования");
        String revers = in.nextLine();

        char[] rev = new char[revers.length()];

        for (int i = 0; i < revers.length(); i++) {
            rev[i] = revers.charAt(i);
        }

        int len = rev.length;

//        Принт в обратном порядке

//        while (len > 0) {
//            System.out.println(rev[len - 1]);
//            len--;
//        }

//        принт в правильном порядке

        for (int i = 0; i < len; i++){
            System.out.println(rev[i]);
        }

    }
}



