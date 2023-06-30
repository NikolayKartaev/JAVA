
/** 
 * program
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

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

    static void PrintString() {
        String s = "hey";
        System.out.println(s);
    }

    static void printInputStr() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s\n", name);
        iScanner.close();
    }

    static void ifDigit() {
        char ch = '1';
        boolean status = Character.isDigit(ch); // проверяем, символ цифра?
        System.out.printf("Статус: %b\n", status);
        char ch2 = 'a';
        boolean status2 = Character.isDigit(ch2); // проверяем, символ цифра?
        System.out.printf("Статус: %b", status2);
    }

    static void charAt() {

        String s = "hello";
        s.replace('h', 'H');
        System.out.println(s);
        System.out.print(s.charAt(0));
    }

    static void ArrLi() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        for (Object iterable_element : list) {
            System.out.println(iterable_element);
        }

    }

    static void Ex0() {
        Scanner iScanner = new Scanner(System.in);
        int x = iScanner.nextInt();
        double y = iScanner.nextDouble();
        System.out.printf("Здесь Х: %d\n", x); // выводим int
        System.out.printf("Здесь Y: %f", y); // выводим double
        iScanner.close();
    }

    static void Ex1() {
        int a = 10;
        int b = 20;
        System.out.println(a + b); // прямой вывод с подсчетом
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c); // конкатенация строк

        String res = String.format("%d + %d = %d", a, b, c); // кладем в переменную строку
        System.out.println(res); // выводим переменную

        System.out.printf("%d + %d = %d \n", a, b, c); // прямой вывод строки
    }

    static void Ex2() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        boolean flag = iScanner.hasNextInt(); // проверяет ввод на соответствие типу (int)
        System.out.println(flag); // выводит true или false
        int n = iScanner.nextInt();
        System.out.println(n);
        iScanner.close();

    }

    static void lection2_1() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hey ");
        stringBuilder.append("baby!");

        System.out.println(stringBuilder);
        String s = "Hey ";
        String s2 = "babies!";
        System.out.println(s.concat(s2));

        String s3 = "YO! ";
        System.out.println(String.join(" ", s3, s, s2));

    }

    // Лекция 5. MAP
    /*
     * ________________MAP__________________ --- MAP - коллекции, работающие с
     * данными по принципу < КЛЮЧ / ЗНАЧЕНИЕ >
     * | | |
     * HASHMAP SORTEDMAP HASHTABLE
     * | |
     * LINKEDHASHMAP NAVIGABLEMAP
     * |
     * TREEMAP
     * 
     * 
     * HASHMAP:
     * 1. ускоренная обработка данных
     * 2. не запоминается порядок добавления
     * 3. уникальные ключи
     * 
     * TREEMAP
     * То же самое, что и HASHMAP, но упорядоченное по ключам
     * 
     * LINKEDHASHMAP
     * То же самое, что и HASHMAP, но помнит порядок добавления элементов
     * 
     * HASHTABLE
     * 
     * 
     */
    public static void Lection5_1() {
        Map<Integer, String> database = new HashMap<>();

        database.putIfAbsent(1, "one"); // Добавляет, если такого ключа нет
        database.put(50, "fifty"); // Добавляет пару ключ/значение
        database.put(2, "two"); // Добавляет пару ключ/значение
        database.putIfAbsent(2, "one");
        database.putIfAbsent(3, "three");
        database.putIfAbsent(100, "hundred");

        System.out.println(database); // {1=one, 50=fifty, 2=two, 3=three, 100=hundred}
        System.out.println(database.get(3)); // three - получение значения по ключу
        System.out.println(database.get(4)); // null
        System.out.println(database.containsValue("two")); // true - проверка присутствия значения
        System.out.println(database.containsKey(2)); // true - проверка присутствия ключа
        System.out.println(database.keySet()); // [1, 50, 2, 3, 100] - возвращает ключи
        System.out.println(database.values()); // [one, fifty, two, three, hundred] - возвращает значения

    }

    public static void Lection5_2() {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(100, "hundred");
        tmap.put(1, "one");
        tmap.put(5, "five");
        tmap.put(10, "ten");
        tmap.put(8, "eight");

        System.out.println(tmap); // {1=one, 5=five, 8=eight, 10=ten, 100=hundred}
        System.out.println(tmap.descendingKeySet()); // [100, 10, 8, 5, 1]
        System.out.println(tmap.descendingMap()); // {100=hundred, 10=ten, 8=eight, 5=five, 1=one}

    }

    public static void Lection5_3() {
        Map<Integer, String> database = new LinkedHashMap<>();

        database.putIfAbsent(1, "one"); // Добавляет, если такого ключа нет
        database.put(50, "fifty"); // Добавляет пару ключ/значение
        database.put(2, "two"); // Добавляет пару ключ/значение
        database.putIfAbsent(2, "one");
        database.putIfAbsent(3, "three");
        database.putIfAbsent(100, "hundred");

        System.out.println(database); // {1=one, 50=fifty, 2=two, 3=three, 100=hundred}
        System.out.println(database.get(3)); // three - получение значения по ключу
        System.out.println(database.get(4)); // null
        System.out.println(database.containsValue("two")); // true - проверка присутствия значения
        System.out.println(database.containsKey(2)); // true - проверка присутствия ключа
        System.out.println(database.keySet()); // [1, 50, 2, 3, 100] - возвращает ключи
        System.out.println(database.values()); // [one, fifty, two, three, hundred] - возвращает значения

    }

    public static void Lection6_1() {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set); // [1, 2, 3, 20, 10, 30]
        System.out.println(set.size()); // 6
        System.out.println(set.contains(10)); // true
        set.remove(10);
        System.out.println(set.size());// 5
        System.out.println(set.contains(10)); // false

        for (var item : set) {
            System.out.print(item + " "); // 1 2 3 20 30
        }
        set.clear();
        System.out.println(set); // []
    }

    public static void Lection6_2() {
        var a = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7, 10, 15, 20));

        var u = new HashSet<Integer>(a);
        u.addAll(b); // Объединение
        var r = new HashSet<Integer>(a);
        r.retainAll(b); // пересечение
        var s = new HashSet<Integer>(a);
        s.removeAll(b); // разность
        var s2 = new HashSet<Integer>(b);
        s2.removeAll(a); // разность

        System.out.println("Объединение: " + u);
        System.out.println("Пересечение: " + r);
        System.out.println("Разность a и b: " + s);
        System.out.println("Разность b и a: " + s2);

        boolean res = a.addAll(b);
        System.out.println(res);

    }

    public static void OOPstart() {
        Worker worker1 = new Worker();
        worker1.id = 1;
        worker1.salary = 50000;
        worker1.name = "Yuri";
        worker1.surname = "Sidorov";

        Worker worker2 = new Worker();
        worker2.id = 2;
        worker2.salary = 70000;
        worker2.name = "Ivan";
        worker2.surname = "Petrov";

        ArrayList<Object> list = new ArrayList<>(Arrays.asList(worker1, worker2));
        for (Object object : list) {
            System.out.println(object);
        }
        ArrayList<Worker> list2 = new ArrayList<>(Arrays.asList(worker1, worker2));
        for (Worker object : list2) {
            System.out.println(object);
        }
        System.out.println(worker1);
        System.out.println(worker2);

    }

    static public void main(String[] args) { // метод Main - точка входа. String[] args - массив строк в качестве
                                             // аргумента

        // ifDigit();
        // charAt();
        // ArrLi();
        // Ex0();
        // Ex1();
        // Ex2();
        // sayHi();
        // System.out.println(sum(10, 15));
        // System.out.println(Factorial(5));
        // lection2_1();
        // Lection5_1();
        // Lection5_2();
        // Lection5_3();
        // Lection6_1();
        // Lection6_2();
        OOPstart();

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

        // ВЕТВЛЕНИЕ

        // if (a > b) {
        // c = a;
        // } else {
        // c = b;
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
        // s/=10;
        // count++;
        // System.out.printf("ЦИКЛ %d ",s);
        // }
        // System.out.printf("\nРЕЗУЛЬТАТ: %d",count);

        // FOR
        // for (int i = 0; i < 10; i++){
        // if (i%2==0){
        // System.out.println(i);
        // }
        // }
        // System.out.println();
        // for (int i = 0; i < 10; i++){
        // if (i%2==0){
        // continue;
        // }
        // System.out.println(i);
        // }

        // FOR: (FOR IN // FOREACH) - сниппет foreach -- работает только с коллекциями
        // // присвоение только внутри цикла
        // int[] array = new int[5];
        // for (int el : array) {

        // System.out.printf("%d ", el);

        // }
        // System.out.println();

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
 * ЛЕКЦИЯ 2.
 * 
 * API - application programming interface - контракт, который предоставляет
 * программа.
 * 
 * StringBuilder - Для компонования, изменения строк.
 * String - для работы с готовыми строками.
 * 
 * 
 * 
 * 
 * ЛЕКЦИЯ 3.
 * КОЛЛЕКЦИИ в JAVA.
 * 
 * 1) Collection --> List --> ArrayList
 * 
 * List - пронумерованный набор элементов
 * 
 * ArrayList list = new ArrayList(); - "удобный массив"
 * List list = new ArrayList(); - сырой вариант
 * ArrayList <Integer> list = new ArrayList <Integer>(); - вариант с приведением
 * типа данных (обобщение)
 * ArrayList <Integer> list = new ArrayList <>();
 * ArrayList <Integer> list = new ArrayList <>(10);
 * ArrayList <Integer> list = new ArrayList <>(list2);
 * 
 * 
 * 
 * 
 * 
 */
