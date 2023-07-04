package JAVA.Lections;

import java.util.List;
import java.util.ArrayList;

public class algorithms {
    public static void main(String[] args) {
        // List<Integer> dividers = findDividers(24);
        // for (Integer div : dividers) {
        // System.out.println(div);
        // }

        // List<Integer> simpleIntegers = findSimple(4);
        // System.out.println(simpleIntegers);

        int[] array = new int[] { 6, 3, 9, 0, 8, 1, 2, 5, 4, 7 };
        bubbleSort(array);
        for (int i : array) {
        System.out.printf("%d ", i);
        
        }
        // System.out.println(String.format("Индекс найденного числа в массиве: %d", findNumber(array, 5)));
        System.out.println();
        System.out.println(
                String.format("Индекс найденного числа в массиве: %d", binarySearch(array, 6)));

    }

    public static List<Integer> findDividers(int number) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // прямая корелляция (линейная зависимость) - сложность O(n) (напрямую зависит
                                   // от
                                   // входящего числа)
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findSimple(int number) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i < number; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) { // поиск простых чисел (цикл в цикле) - квадратичная зависимость (сложность
                                          // O(n**2))
                counter++;
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                result.add(i);
            }

        }
        System.out.println(String.format("COUNTER: %d", counter));

        return result;
    }

    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }

            }
        } while (!finish);
    }

    public static void directSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[minPosition]) {
                    minPosition = j;
                }

            }
            if (i != minPosition) {
                int temp = arr[i];
                arr[i] = arr[minPosition];
                arr[minPosition] = temp;
            }
        }

    }

    public static int findNumber(int[] array, int number) { // O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return i;
        }
        return -1;

    }

    public static int binarySearch(int[] array, int value, int min, int max) { // O(log n)
        int middle;

        if (max < min) {
            return -1;
        } else {
            middle = (max - min) / 2 + min; ;
        }

        if (array[middle] < value) {
            return binarySearch(array, value, middle + 1, max);
        } else {
            if (array[middle] > value) {
                return binarySearch(array, value, min, middle - 1);
            } else {
                return middle;
            }

        }
    }

    public static int binarySearch (int[] array, int value) { // перегрузка метода
        return binarySearch(array, value, 0, array.length-1);
    }
}
