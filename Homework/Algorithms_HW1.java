package JAVA.Homework;

/**
 * AlgorithmsHW1
 */
public class Algorithms_HW1 {

    public static void main(String[] args) {
        int[] array = { 12, 11, 13, 5, 6, 7, 10, 100, 200, 500, 111, 444, 1010, 1, 2, 3 };

        System.out.println("Исходный массив:");
        printArray(array);
        printArray2(array);

        heapSort(array);

        System.out.println("\nОтсортированный массив:");
        printArray(array);
        printArray2(array);

    }

    public static void heapify(int[] array, int size, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < size && array[left] > array[largest]) {
            largest = left;
        }

        if (right < size && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != root) {
            int temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;

            heapify(array, size, largest);
        }
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public static void printArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);

            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        System.out.println(builder.toString());
    }

    public static void printArray2(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
