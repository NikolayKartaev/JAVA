package JAVA.Homework;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Homework4 {

    public static Integer ReturnInt(Deque<String> deque) {
        String number_str = "";
        int length = deque.size();
        for (int i = 0; i < length; i++) {
            number_str += deque.getLast();
            deque.removeLast();
        }
        int number = Integer.parseInt(number_str);
        return number;
    }

    public static LinkedList<String> Return_multiply_LL(int a, int b) {
        LinkedList<String> multiply_LL = new LinkedList<>();
        String multiply_str = Integer.toString(a * b);

        for (int i = 0; i < multiply_str.length(); i++) {
            String[] array = multiply_str.split("");
            multiply_LL.add(array[i]);
        }

        return multiply_LL;
    }

    public static LinkedList<String> Return_add_LL(int a, int b) {
        LinkedList<String> add_LL = new LinkedList<>();
        String add_str = Integer.toString(a + b);

        for (int i = 0; i < add_str.length(); i++) {
            String[] array = add_str.split("");
            add_LL.add(array[i]);
        }

        return add_LL;
    }

    public static void main(String[] args) {
        Deque<String> dq1 = new ArrayDeque<>(Arrays.asList("4", "3", "2", "1", "-"));
        Deque<String> dq2 = new ArrayDeque<>(Arrays.asList("6", "7", "8", "9"));

        int x = ReturnInt(dq1);
        int y = ReturnInt(dq2);

        System.out.println(Return_multiply_LL(x, y));
        System.out.println(Return_add_LL(x, y));

    }
}
