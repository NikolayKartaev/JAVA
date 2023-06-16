package JAVA.Seminars;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;

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

    public static void Seminar2_1() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите число N: ");
        int N = iScanner.nextInt();

        while (N%2!=0 || N<=0) {
            System.out.print("Введите четное число N: ");
            N = iScanner.nextInt();
        }
        System.out.print("Введите с1: ");
        String c1 = iScanner.next();
        System.out.print("Введите с2: ");
        String c2 = iScanner.next();
        String res = "";

        for (int i = 0; i < N; i++) {
            if (i%2==0) {
                res+=c1;
            }
            else res+=c2;
        }

        System.out.println(res);  
    }

    public static String MakeString(int N, String c1, String c2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N/2; i++) {
            result.append(c1+c2);
        }

        return result.toString();
    }

    public static void Input_print1() {
        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.print("Введите число N: ");
        int N = iScanner.nextInt();

        while (N%2!=0 || N<=0) {
            System.out.print("Введите четное число N: ");
            N = iScanner.nextInt();
        }
        System.out.print("Введите с1: ");
        String c1 = iScanner.next();
        System.out.print("Введите с2: ");
        String c2 = iScanner.next();

        System.out.println(MakeString(N, c1, c2));
    }

    public static String Compresse(String input_str) { // aaaabbbcdd a4b3cd2
        StringBuilder compressed = new StringBuilder();
        compressed.append(input_str.charAt(0));
        int count = 1;
        for (int i = 1; i < input_str.length() ; i++) {
            if (input_str.charAt(i-1) == input_str.charAt(i)) {
                count+=1;
            }
            else {
                if (count !=1) {
                    compressed.append(""+count);
                    count=1;
                    compressed.append(input_str.charAt(i));
                }
                else compressed.append(input_str.charAt(i));
            }
        }
        if (count!=1) compressed.append(""+count);
        return compressed.toString();
    }

    public static void Input_Print2() {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        System.out.println(Compresse(str));
    }

    // Записать в файл слово TEST 10 раз

    public static void WriteText() {
        // int N = 10;
        // String word = "TEST";
        // try {
        //     FileWriter writer = new FileWriter("text.txt", true); // false - перезапись, true - добавление
        //     for (int i = 0; i < N; i++) {
        //         writer.write(word);
        //         writer.write("\n");
        //     }
        //     System.out.println("Все ОК");
        //     writer.close();

        // }
        // catch (Exception e) {
        //     System.out.println("Чтото пошло не так");
        // }
        
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
        }
        catch (Exception e) {
            System.out.println("Чтото пошло не так");
        }

    }
    public static void main(String[] args) {
        // Seminar2_1();
        // Input_print1();
        // Input_Print2();
        WriteText();
    }
}
