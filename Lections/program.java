
/** 
 * program
 */
import java.util.Scanner;

public class program { // Структура простой программы

    static void sayHi() {
        System.out.println("Hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double Factorial(int a) {
        if (a == 1)
            return 1;
        return Factorial(a - 1) * a;
    }

    static public void main(String[] args) { // точка входа. String[] args - массив строк в качестве аргумента
        // System.out.println("Bye-bye, world");

        // String s = "hey";
        // System.out.println(s);
        // System.out.println();

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();

        // int x = iScanner.nextInt();
        // double y = iScanner.nextDouble();

        System.out.printf("Привет, %s\n", name);
        // System.out.printf("%d\n", x);
        // System.out.printf("%f", y);

        // System.out.printf("Введите число n: ");
        // boolean flag = iScanner.hasNextInt(); // проверяет ввод на соответствие типу
        // (int)
        // System.out.println(flag);
        // int n = iScanner.nextInt();
        // System.out.println(n);
        iScanner.close();

        // int a = 10;
        // int b = 20;
        // int c = a + b;
        // System.out.println(a + b); // прямой вывод с подсчетом

        // String result = a + " + " + b + " = " + c; // конкатенация строк - кладем в result строку
        // System.out.println(result); // выводим переменную

        // String res = String.format("%d + %d = %d", a, b, c); // кладем в переменную строку
        // System.out.println(res); // выводим переменную

        // System.out.printf("%d + %d = %d \n", a, b, c); // прямой вывод строки

        /*
         * ВИДЫ СПЕЦИФИКАТОРОВ
         * %d - целые числа
         * %f - числа с плавающей точкой
         * %.2f - вывод количества знаков послезапятой числа с плавающей точкой
         * %x - шеснадцатиричные числа
         * %e - экспоненциальная форма числа
         * %.2e - вывод количества знаков послезапятой экспоненциальной формы числа
         * %c - одиночный символ
         * %s - вывод строковых значений
         * 
         */

        // ФУНКЦИИ (return) И МЕТОДЫ (void)

        // sayHi();
        // System.out.println(sum(10, 15));
        // System.out.println(Factorial(5));

        // ВЕТВЛЕНИЕ

        // if (a > b) {
        //     c = a;
        // } else {
        //     c = b;
        // }

        // if (a > b) c = a;
        // else c = b;

        // int min = a > b ? a : b; // тернарный оператор - возвращает значение
        // System.out.println(min);

        // ОПЕРАТОР ВЫБОРА SWITCH

        // ЦИКЛЫ

        // int s = 321;
        // int count = 0;

        // while (s!=0) {
        //     s/=10;
        //     count++;
        //     System.out.printf("ЦИКЛ %d ",s);
        // }
        // System.out.printf("\nРЕЗУЛЬТАТ: %d",count);

        // FOR
        // for (int i = 0; i < 10; i++){
        //     if (i%2==0){
        //         System.out.println(i);
        //     }
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++){
        //     if (i%2==0){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // FOR: (FOR IN // FOREACH) - сниппет foreach -- работает только с коллекциями // присвоение только внутри цикла
        int[] array = new int[5];
        for (int el: array)
        {
            
            System.out.printf("%d ",el);

        }
        System.out.println();




    }
}
/*
 * Типы данных: ссылочные, примитивные
 * Ссылочные: массивы + ...
 * Примитивные: boolean, int, short, long, double, float, Char
 * 
 * Создание переменной:
 * 1. <тип> <идентификатор>;
 * 2. <идентификатор> = <значение>;
 * 
 * либо тип> <идентификатор> = <значение>;
 * 
 * float e = 2.7f - обязателньо f на конце
 * double pi = 3.1415 (суффикс d не обязателен)
 * 
 * String s = "qwerty"
 * s.length - длина строки
 * s.charAt(1) - обращение к элементу с индексом 1
 * 
 * System.out.println(a++); сперва вывод, затем инкремент - постфиксный
 * System.out.println(++a) сперва инкремент, затем вывод - префиксный
 * 
 * МАССИВЫ
 * int[] arr = new int[5]
 * int[] arr = new int[] {1,2,3,4,5}
 * int arr[]
 * arr[3] = 10
 * System.out.println(arr[3]) --> 10
 * 
 * int[][] arr = new int[3][5]
 * int[] arr[] = new int[3][5]
 * 
 * for (int i = 0; i < arr.length; i++) {
 * for (int j = 0; j < arr[i].length; j++) {
 * System.out.println("%d ", arr[i][j])
 * }
 * System.out.println()
 * }
 * 
 * for (int[] line: arr) {
 * for (int item: line) {
 * System.out.println("%d ", item)
 * }
 * System.out.println()
 * }
 * 
 * 
 * 
 */
