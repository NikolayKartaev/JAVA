package JAVA.Seminars;

import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.io.File;
import java.util.Random;

/**
 * 1) Написать программу, которая запросит пользователя ввести <Имя> в консоли.
 * Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 * 
 * 2-3) Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное
 * количество подряд идущих 1.
 * 
 * 4) Дан массив nums = [3,2,2,3,4,2,3] и число val = 3.
 * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
 * конец массива.
 * Таким образом, первые несколько (или все) элементов массива должны быть
 * отличны от заданного,
 * а остальные - равны ему.
 **/

public class J_seminars {

    public static void task1() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.printf("Имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
        System.out.println();
    }

    public static void PrintArr(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.printf("%d]", array[array.length - 1]);
        System.out.println("]");
    }

    public static void task2() {

        int[] array = new int[] { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        for (int el : array) {
            if (el == 1)
                count++;
            if (el == 0)
                count = 0;
        }
        System.out.println(count);
    }

    public static void task3() {
        int[] array = new int[] { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
        int maxlength = 0;
        int temp_length = 0;
        int max_index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                temp_length++;
            } else {
                if (maxlength < temp_length) {
                    maxlength = temp_length;
                    max_index = i - maxlength;
                }
                temp_length = 0;
            }
        }
        if (maxlength < temp_length) {
            maxlength = temp_length;
            max_index = array.length - maxlength;
        }

        for (int i = max_index; i < max_index + maxlength; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    // Дан массив nums = [3,2,2,3,4,2,3] и число val = 3.
    // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
    // конец массива. Таким образом, первые несколько (или все) элементов массива
    // должны быть
    // отличны от заданного, а остальные - равны ему.
    // **/
    public static void task4() {
        int[] array = new int[] { 1, 3, 3, 3, 2, 3, 2, 3, 4, 2, 3, 4, 5, 6 };
        int val = 3;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] == val) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // for (int i = 0; i < array.length; i++) {
        // System.out.printf("%d", array[i]);
        // }
        PrintArr(array);
    }

    // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
    // порядке
    public static void task5() {
        String phrase = "Добро пожаловать на курс по Java";
        String[] arr = phrase.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%s ", arr[i]);
        }

    }

    public static void Seminar2_1() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите число N: ");
        int N = iScanner.nextInt();

        while (N % 2 != 0 || N <= 0) {
            System.out.print("Введите четное число N: ");
            N = iScanner.nextInt();
        }
        System.out.print("Введите с1: ");
        String c1 = iScanner.next();
        System.out.print("Введите с2: ");
        String c2 = iScanner.next();
        String res = "";

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                res += c1;
            } else
                res += c2;
        }
        iScanner.close();
        System.out.println(res);
    }

    public static String MakeString(int N, String c1, String c2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N / 2; i++) {
            result.append(c1 + c2);
        }

        return result.toString();
    }

    public static void Input_print1() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите число N: ");
        int N = iScanner.nextInt();

        while (N % 2 != 0 || N <= 0) {
            System.out.print("Введите четное число N: ");
            N = iScanner.nextInt();
        }
        System.out.print("Введите с1: ");
        String c1 = iScanner.next();
        System.out.print("Введите с2: ");
        String c2 = iScanner.next();
        iScanner.close();
        System.out.println(MakeString(N, c1, c2));
    }

    public static String Compresse(String input_str) { // aaaabbbcdd a4b3cd2
        StringBuilder compressed = new StringBuilder();
        compressed.append(input_str.charAt(0));
        int count = 1;
        for (int i = 1; i < input_str.length(); i++) {
            if (input_str.charAt(i - 1) == input_str.charAt(i)) {
                count += 1;
            } else {
                if (count != 1) {
                    compressed.append("" + count);
                    count = 1;
                    compressed.append(input_str.charAt(i));
                } else
                    compressed.append(input_str.charAt(i));
            }
        }
        if (count != 1)
            compressed.append("" + count);
        return compressed.toString();
    }

    public static void Input_Print2() {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        System.out.println(Compresse(str));
        iScanner.close();
    }

    // Записать в файл слово TEST 10 раз

    public static void WriteText() {
        int N = 10;
        String word = "TEST";
        try {
            FileWriter writer = new FileWriter("text.txt", true); // false - перезапись, true - добавление
            for (int i = 0; i < N; i++) {
                writer.write(word);
                writer.write("\n");
            }
            System.out.println("Все ОК");
            writer.close();

        } catch (Exception e) {
            System.out.println("Чтото пошло не так");
        }

        File file = new File(("text.txt"));
        try {
            FileReader reader = new FileReader(file);
            char[] array = new char[(int) file.length()]; // для чтения всего файла
            // char[] array = new char[20]; // для указания определенной длины
            reader.read(array);
            for (char c : array) {
                System.out.print(c);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Чтото пошло не так");
        }

    }

    // Seminar 3
    public static void CountTimes() {
        ArrayList<String> planets = new ArrayList<String>();
        planets.add("Moon");
        planets.add("Moon");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Pluton");
        planets.add("Pluton");
        planets.add("Mars");
        planets.add("Mars");
        planets.add("Mars");
        planets.add("Moon");
        planets.add("Neptune");
        planets.add("Mars");
        planets.add("Moon");
        ArrayList<String> planets_unique = new ArrayList<String>();

        int count = 0;

        for (int i = 0; i < planets.size(); i++) {

            if (!planets_unique.contains(planets.get(i))) {
                planets_unique.add(planets.get(i));

                for (int j = i; j < planets.size(); j++) {
                    if (planets.get(i) == planets.get(j)) {
                        count++;
                    }
                }
                System.out.println(planets.get(i) + ": " + count);
            }
            count = 0;

        }
    }

    public static void sortingTask() {
        ArrayList<Integer> list_int = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 15; i++) {
            list_int.add(rand.nextInt(100));
        }
        System.out.println(list_int);
        list_int.sort(Comparator.naturalOrder()); // или null
        System.out.println(list_int);

    }

    // public static void Seminar3_task3() {
    // List list = new ArrayList<>();
    // list.add(123);
    // list.add("string");
    // list.add("string2");
    // list.add(321);
    // list.add(3231);

    // System.out.println(list);
    // // вариант 1
    // // for (int i = 0; i < list.size(); i++) {
    // // if (list.get(i) instanceof Integer) {
    // // list.remove(i);
    // // i--;
    // // }
    // // }

    // // вариант 2 через ИТЕРАТОР
    // java.util.Iterator iter = list.iterator();
    // while (iter.hasNext()) {
    // if (iter.next() instanceof Integer) {
    // iter.remove();
    // }
    // }
    // System.out.println(list);

    // }

    public static void Seminar4_task1() {
        ArrayList<Integer> list1 = new ArrayList<>();
        Long StartTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000_00000; i++) {
            list1.add(0);
        }
        long EndTime1 = System.currentTimeMillis();
        long result1 = EndTime1 - StartTime1;

        LinkedList<Integer> list2 = new LinkedList<>();
        long StartTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000_00000; i++) {
            list2.add(0);
        }
        long EndTime2 = System.currentTimeMillis();
        long result2 = EndTime2 - StartTime2;

        System.out.println(result1);
        System.out.println(result2);

    }

    public static void Seminar4_task2() {
        ArrayList<Integer> list1 = new ArrayList<>();
        Long StartTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000_00; i++) {
            list1.add(0, 0);
        }
        long EndTime1 = System.currentTimeMillis();
        long result1 = EndTime1 - StartTime1;

        LinkedList<Integer> list2 = new LinkedList<>();
        long StartTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000_00; i++) {
            list2.add(0, 0);
        }
        long EndTime2 = System.currentTimeMillis();
        long result2 = EndTime2 - StartTime2;

        System.out.println(result1);
        System.out.println(result2);

    }

    public static void Seminar4_task3() {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<String> list1 = new LinkedList<>();
        String message = "";
        while (!message.equals("exit")) {
            message = iScanner.nextLine();

            if (message.startsWith("print~")) {
                String[] list2 = message.split("~");
                System.out.println(list1.remove(Integer.parseInt(list2[1])));
            } else
                list1.add(message);
            System.out.println(list1);

        }

    }

    public static void Seminar4_task4() {
        Scanner iScanner = new Scanner(System.in);
        Stack<String> list1 = new Stack<>();
        String message = "";
        while (!message.equals("exit")) {
            message = iScanner.nextLine();
            if (message.equals("print")) {
                while (!list1.empty()) { // пока не пустой
                    System.out.print(list1.pop() + " "); // делаем вывод последнего вхождения через .pop()
                }
                System.out.println(list1);
                message = "exit";
            } else
                list1.push(message);

        }

    }

    public static void Seminar4_task5() {
        String[] array = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
        System.out.print(PrintQueue(array));
        ;

    }

    public static Queue<String> PrintQueue(String[] arr) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            // queue.add(arr[i]); // добавляет и выбрасывает исключение
            queue.offer(arr[i]); // добавляет и не выбрасывает исключение

        }
        return queue;
    }

    public static void main(String[] args) {
        // Seminar2_1();
        // Input_print1();
        // Input_Print2();
        // WriteText();
        // CountTimes();
        // sortingTask();
        // Seminar3_task3();
        // Seminar4_task1();
        // Seminar4_task2();
        // Seminar4_task3();
        // Seminar4_task4();
        Seminar4_task5();

    }
}
