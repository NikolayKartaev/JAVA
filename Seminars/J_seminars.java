package JAVA.Seminars;

import java.util.Scanner;

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

    // Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке
    public static void task5() {
        String phrase = "Добро пожаловать на курс по Java";
        String[] arr = phrase.split(" ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.printf("%s ",arr[i]);
        }
        
    }
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        task5();

    }
}
