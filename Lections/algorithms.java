package JAVA.Lections;

import java.util.List;
import java.util.ArrayList;

public class algorithms {
    public static void main(String[] args) {
        // List<Integer> dividers = findDividers(24);
        // for (Integer div : dividers) {
        //     System.out.println(div);
        // }

        List<Integer> simpleIntegers = findSimple(4);
        System.out.println(simpleIntegers);
        
    }

    public static List<Integer> findDividers(int number) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // прямая кореляция (линейная зависимость) - сложность O(n) (напрямую зависит от входящего числа)
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
            for (int j = 2; j < i; j++) { // поиск простых чисел (цикл в цикле) - квадратичная зависимость (сложность O(n**2))
                counter++;
                if (i%j==0) {
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
}

