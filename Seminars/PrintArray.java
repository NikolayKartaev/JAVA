package JAVA.Seminars;

/**
 * PrintArray
 */
public class PrintArray {

    public static void PrintArr(int[] array) {
        System.out.printf("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.printf("%d", array[array.length-1]);
        System.out.println("]");
    }
}