package JAVA.Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Homework3
 */
public class Homework3 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(21);
        list1.add(67);
        list1.add(39);
        list1.add(46);
        list1.add(25);
        System.out.printf("Первоначальный список: %s\n", list1);

        RemoveEvenNumbers(list1);
        System.out.printf("После удаления четных: %s\n", list1);

        FindMin(list1);
        FindMax(list1);
        FindAverage(list1);
    }

    public static void RemoveEvenNumbers(List<Integer> list) {
        list.removeIf(number -> number % 2 == 0);
    }

    public static void FindMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (Integer number : list) {
            if (number < min) {
                min = number;
            }
        }
        System.out.printf("Минимальное значение: %d\n", min);
    }

    public static void FindMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        System.out.printf("Максимальное значение: %d\n", max);
    }

    public static void FindAverage(List<Integer> list) {
        double sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        System.out.printf("Среднее значение: %.2f", sum / list.size());
    }
}