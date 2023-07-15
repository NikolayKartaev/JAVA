
import java.util.ArrayList;

public class algorithms {
    public static void main(String[] args) {
        // ArrayList<Integer> dividers = findDividers(24);
        // for (Integer div : dividers) {
        // System.out.println(div);
        // }

        // List<Integer> simpleIntegers = findSimple(4);
        // System.out.println(simpleIntegers);

        // int[] array = new int[] { 6, 3, 9, 0, 8, 1, 2, 5, 4, 7 };
        // bubbleSort(array);
        // for (int i : array) {
        // System.out.printf("%d ", i);

        // }
        // System.out.println(String.format("Индекс найденного числа в массиве: %d",
        // findNumber(array, 5)));
        // System.out.println();
        // System.out.println(
        // String.format("Индекс найденного числа в массиве: %d", binarySearch(array,
        // 6)));

    }

    public static ArrayList<Integer> findDividers(int number) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // прямая корелляция (линейная зависимость) - сложность O(n) (напрямую зависит
                                   // от
                                   // входящего числа)
                result.add(i);
            }
        }
        return result;
    }

    public static ArrayList<Integer> findSimple(int number) {
        ArrayList<Integer> result = new ArrayList<>();
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

    public static void bubbleSort(int[] array) { // СОРТИРОВКА ПУЗЫРЬКОМ
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

    public static void directSort(int[] arr) { // СОРТИРОВКА ВЫБОРОМ
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

    public static int findNumber(int[] array, int number) { // O(n) поиск в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return i;
        }
        return -1;

    }

    public static int binarySearch(int[] array, int value, int min, int max) { // O(log n) Бинарный поиск
        int middle;

        if (max < min) {
            return -1;
        } else {
            middle = (max - min) / 2 + min;
            ;
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

    public static int binarySearch(int[] array, int value) { // перегрузка метода
        return binarySearch(array, value, 0, array.length - 1);
    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }

    public class List {
        Node head;
        Node tail;

        public Node Find(int value) {
            Node currentNode = head;

            while (currentNode != null) {
                if (currentNode.value == value) {
                    return currentNode;
                }
                currentNode = currentNode.next;
            }
            return null;
        }

        public void add(int value) {
            Node node = new Node();
            node.value = value;
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                node.previous = tail;
                tail = node;
            }
        }
    }

    public class Tree {
        Node root;

        public boolean exist(int value) {
            if (root != null) {
                Node node = findDepth(root, value);
                if (node != null) {
                    return true;
                }
            }
            return false;

        }

        private Node findDepth(Node node, int value) { // Обход в глубину (рекурсивный)
            if (node.value == value) {
                return node;
            } else {
                for (Node child : node.children) {
                    Node result = findDepth(child, value);
                    if (result != null) {
                        return result;
                    }
                }
            }
            return null;
        }

        public class Node {
            int value;
            ArrayList<Node> children;
        }
    }

}
