import java.util.Arrays;
import java.util.Scanner;

/**
 * Seminar1
 */
public class Seminar1 {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(Task1(array, 4));
        System.out.println(Task1(array, 6));

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
        iScanner.next();
        System.out.println("Введите искомое число");
        int number = iScanner.nextInt();

        int answer = Task2(arr, min, number);
        if (answer == -1) {
            System.out.printf("Длина массива меньше %d", min);
        } else if (answer == -2) {
            System.out.printf("Элемент %d не найден", number);
        } else if (answer == -3) {
            System.out.println("Массив не определен");
        }
    }

    public static int Task2(int[] array, int min, int find) {
        if (array.length < min) {
            return -1;
        }
        if (array == null) {
            return -3;
        } else {
            int index = Arrays.binarySearch(array, find);
            return (index < 0) ? -2 : index;
        }

    }

}