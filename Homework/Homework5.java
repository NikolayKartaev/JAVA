/*
 * Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

Пример:
Иванов 1231234
Иванов 3456345
Иванов 5676585
Петров 12345
Петров 82332
 * 
 */

package JAVA.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Homework5 {

    public static void main(String[] args) {

        Map<String, ArrayList<String>> telephones = new HashMap<>();

        addNumber(telephones, "Иванов", "123456");
        addNumber(telephones, "Иванов", "234567");
        addNumber(telephones, "Иванов", "345678");
        addNumber(telephones, "Петров", "456789");
        addNumber(telephones, "Петров", "567890");
        addNumber(telephones, "Петров", "678901");
        addNumber(telephones, "Петров", "789012");

        printPhoneBook(telephones);

    }

    public static void addNumber(Map<String, ArrayList<String>> hashmap, String surname, String number) {
        if (hashmap.containsKey(surname)) {
            ArrayList<String> uniqueNumbers = hashmap.get(surname);
            uniqueNumbers.add(number);
        } else {
            ArrayList<String> newNumbers = new ArrayList<>();
            newNumbers.add(number);
            hashmap.put(surname, newNumbers);
        }

    }

    public static void printPhoneBook(Map<String, ArrayList<String>> phoneBook) {
    ArrayList<Map.Entry<String, ArrayList<String>>> entries = new ArrayList<>(phoneBook.entrySet());

    // Сортировка списка по убыванию числа телефонов
    Collections.sort(entries, (entry1, entry2) -> entry2.getValue().size() -
    entry1.getValue().size());

    // Вывод отсортированных контактов
    for (Map.Entry<String, ArrayList<String>> entry : entries) {
    String name = entry.getKey();
    ArrayList<String> phoneNumbers = entry.getValue();
    System.out.println(name + " " + phoneNumbers);
    }
    }

}
