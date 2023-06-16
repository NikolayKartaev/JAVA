package JAVA.Homework;

import java.io.FileWriter;

public class Homework2 {

    // Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть
    // WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
    // ниже в виде json-строки.
    // Если значение null, то параметр не должен попадать в запрос.
    // Ввод данных: {"name":"Ivanov", "country":"Russia", "city":"Moscow",
    // "age":"null"}
    // вывод: select * from students WHERE name=Ivanov AND country=Russia AND
    // city=Moscow

    public static String Task1() {
        String input_str = "{'name':'Nick', 'country':'USA', 'city':'Charlotte', 'age':'36'}";
        String sql_request = "select * from students WHERE ";

        StringBuilder where = new StringBuilder();

        String[] array = input_str.substring(1, input_str.length() - 1).split(", ");

        for (String word : array) {
            word = word.replaceAll("'", "");
            String[] words = word.split(":");
            String key = words[0];
            String value = words[1];

            if (!value.equals("null")) {
                if (where.length() > 0) {
                    where.append(" AND ");
                }
                where.append(key).append("=").append(value);
            }
        }
        String result = sql_request + where.toString();
        return result;
    }

    // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
    // после каждой итерации запишите в лог-файл.

    public static void Task2() {
        int[] array = new int[] { 5, 1, 10, 3, 6, 11, 2, 4, 9, 15 };

        try {
            FileWriter writer = new FileWriter("logs.txt", false);
            writer.write("Начальный массив: " + printArray(array) + "\n");
            boolean status = true;
            int number = 0;

            while (status) {
                status = false;

                for (int i = 0; i < array.length - 1; i++) {
                    number++;
                    if (array[i] > array[i + 1]) {
                        int temp = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = temp;
                        status = true;
                    }
                    writer.write("Итерация № " + number + ": " + printArray(array) + "\n");
                }

            }
            writer.write("Отсортированный массив: " + printArray(array) + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Чтото пошло не так");
        }

    }

    public static String printArray(int[] array) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);

            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {

        // System.out.println(Task1());
        Task2();
    }
}
