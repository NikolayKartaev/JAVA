package JAVA.Homework;

import java.util.Scanner;

public class Homework1 {

    /*
     * Задача 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n!
     * (произведение чисел от 1 до n)
     */

    public static void FindSumN(int N) {
        int TRValue = 0;
        TRValue = (N * (1 + N)) / 2;
        System.out.printf("%d-ое треугольное число равно: %d\n", N, TRValue);
    }

    public static void Factorial(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        System.out.printf("Факториал числа %d! = %d\n", N, result);
    }

    public static void Task1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = iScanner.nextInt();
        iScanner.nextLine();
        FindSumN(N);
        Factorial(N);
    }

    /*
     * 2) Вывести все простые числа от 1 до 1000
     */

    public static void FindNums() {
        System.out.print("Простые числа от 1 до 1000: ");
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= 500; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count <= 2) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }

    /*
     * 3) Реализовать простой калькулятор
     */

    public static void Calculator() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите первое число: ");
        
        int num1 = iScanner.nextInt();
        System.out.print("Введите знак действия: ");
        char action = iScanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        int num2 = iScanner.nextInt();

        System.out.print("Результат: ");
        if (action == '+')
            System.out.println(num1 + num2);
        else if (action == '-')
            System.out.println(num1 - num2);
        else if (action == '*')
            System.out.println(num1 * num2);
        else if (action == '/')
            System.out.println(num1 / num2);

        iScanner.close();
    }

    public static void main(String[] args) {

        System.out.println("ЗАДАЧА 1: \n");
        Task1();

        System.out.println("\nЗАДАЧА 2: \n");
        FindNums();

        System.out.println("\nЗАДАЧА 3: ");
        Calculator();

    }
}
