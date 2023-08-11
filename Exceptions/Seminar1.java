import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Seminar1
 */
public class Seminar1 {

    public static void main(String[] args) {
        // int[] array = { 1, 2, 3, 4, 5 };
        // System.out.println(Task1(array, 4));
        // System.out.println(Task1(array, 6));
        // Ask();
        // Task3();
        Integer[] Arr = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        checkArray(Arr);
    }

    public static int Task1(int[] array, int min) {
        if (array.length < min) {
            return -1;
        }
        return array.length;
    }

    public static void Ask() {
        Scanner iScanner = new Scanner(System.in, "utf-8");
        System.out.println("Введите массив через пробел");
        String[] arrString = (iScanner.nextLine()).split(" ");
        int[] arr = new int[arrString.length];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = Integer.parseInt(arrString[index]);
        }
        System.out.println("Введите минимум");
        int min = iScanner.nextInt();
        System.out.println("Введите искомое число");
        int number = iScanner.nextInt();
        iScanner.close();
        int answer = Task2(arr, min, number);
        if (answer == -1) {
            System.out.printf("Длина массива меньше %d", min);
        } else if (answer == -2) {
            System.out.printf("Элемент %d не найден", number);
        } else if (answer == -3) {
            System.out.println("Массив не определен");
        } else
            System.out.printf("Индекс равен %d", answer);
    }

    public static int Task2(int[] array, int min, int find) {
        int number = 0;
        if (array == null) {
            number = -3;
        }
        number = Arrays.binarySearch(array, find);
        if (number < 0) {
            number = -2;
        }
        if (array.length < min) {
            number = -1;
        }

        return number;
    }

    public static void Task3() {
        int[][] array = { { 1, 0 }, { 1, 1 } };
        System.out.println(sum(array));
    }

    public static int sum(int[][] arr) {

        if (arr.length != arr[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        int summa = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if ((arr[i][j] != 0 && arr[i][j] != 1)) {
                    throw new RuntimeException("Неыерные элементы массива");

                }
                summa += arr[i][j];
            }
        }
        return summa;
    }

    public static void checkArray(Integer[] Arr) {
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == null) {
                indexList.add(i);
            }
        }
        if (indexList.size() > 0) {
            throw new RuntimeException("В массиве есть значения null на следующих позициях " + indexList.toString());
        }
    }

}