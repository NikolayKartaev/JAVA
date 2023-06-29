/*
 * Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
*/

package JAVA.Homework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Homework5 {

    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> phones = new HashMap<>();

        addNumber(phones, "Сидоров", 876543);
        addNumber(phones, "Иванов", 123456);
        addNumber(phones, "Иванов", 234567);
        addNumber(phones, "Иванов", 345678);
        addNumber(phones, "Сидоров", 765432);
        addNumber(phones, "Петров", 456789);
        addNumber(phones, "Петров", 567890);
        addNumber(phones, "Сидоров", 654321);
        addNumber(phones, "Сидоров", 543219);
        addNumber(phones, "Петров", 678901);
        addNumber(phones, "Петров", 789012);
        addNumber(phones, "Сидоров", 987654);

        sortPhones(phones);

    }

    public static void addNumber(Map<String, ArrayList<Integer>> hashmap, String surname, Integer number) {
        if (hashmap.containsKey(surname)) {
            ArrayList<Integer> AddedNumbers = hashmap.get(surname);
            AddedNumbers.add(number);
        } else {
            ArrayList<Integer> newNumbers = new ArrayList<>();
            newNumbers.add(number);
            hashmap.put(surname, newNumbers);
        }
    }

    public static void sortPhones(Map<String, ArrayList<Integer>> hashmap) {
        ArrayList<Map.Entry<String, ArrayList<Integer>>> entries = new ArrayList<>(hashmap.entrySet());
        Collections.sort(entries, (entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        for (Map.Entry<String, ArrayList<Integer>> entry : entries) {
            String surname = entry.getKey();
            ArrayList<Integer> numbers = entry.getValue();
            System.out.println(surname + ": " + numbers);
        }
    }

}
