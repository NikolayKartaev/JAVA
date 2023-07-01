package JAVA.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * // Подумать над структурой класса Ноутбук для магазина техники - выделить
 * поля и методы.
 * // Создать множество ноутбуков.
 * // Написать метод, который будет запрашивать у пользователя критерий
 * фильтрации и выведет ноутбуки, отвечающие фильтру.
 * // NoteBook notebook1 = new NoteBook
 * // NoteBook notebook2 = new NoteBook
 * // NoteBook notebook3 = new NoteBook
 * // NoteBook notebook4 = new NoteBook
 * // NoteBook notebook5 = new NoteBook
 * 
 * // Например: “Введите цифру, соответствующую необходимому критерию:
 * // 1 - ОЗУ
 * // 2 - Объем ЖД hd hdd
 * // 3 - Операционная система
 * // 4 - Цвет
 * 
 * // Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * // Отфильтровать ноутбуки их первоначального множества и вывести проходящие
 * по условиям.
 * // Класс сделать в отдельном файле
 * 
 * // приветствие
 * // Выбор параметра
 * // выбор конкретнее
 * // вывод подходящих
 */

public class Homework6 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(123456789, "ASUS", "i9", "Windows", "Grey", 32, 1024);
        Notebook notebook2 = new Notebook(234567890, "MSI", "i7", "Windows", "Blue", 16, 512);
        Notebook notebook3 = new Notebook(345678901, "MSI", "i5", "Windows", "Black", 16, 256);
        Notebook notebook4 = new Notebook(456789012, "ASUS", "i7", "Linux", "Grey", 16, 1024);
        Notebook notebook5 = new Notebook(456789013, "ACER", "i5", "Windows", "Blue", 16, 512);
        Notebook notebook6 = new Notebook(456789014, "ACER", "i3", "Windows", "Grey", 6, 256);
        Notebook notebook7 = new Notebook(858503444, "HP", "i3", "Windows", "White", 4, 128);
        Notebook notebook8 = new Notebook(457300433, "HP", "i5", "Windows", "Grey", 8, 256);
        Notebook notebook9 = new Notebook(453556466, "APPLE", "M2", "iOS", "Grey", 32, 1024);

        Set<Notebook> notebooks_list = new HashSet<>();
        notebooks_list.add(notebook1);
        notebooks_list.add(notebook2);
        notebooks_list.add(notebook3);
        notebooks_list.add(notebook4);
        notebooks_list.add(notebook5);
        notebooks_list.add(notebook6);
        notebooks_list.add(notebook7);
        notebooks_list.add(notebook8);
        notebooks_list.add(notebook9);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n"
                + "1 - Объем HDD \n"
                + "2 - Объем ОЗУ \n"
                + "3 - Процессор \n"
                + "4 - Производитель\n"
                + "5 - Операционная система\n"
                + "6 - Цвет");

        int filter = iScanner.nextInt();
        iScanner.nextLine();
        System.out.println("Введите минимальное значение для указанного критерия:");
        
        String minimum = iScanner.nextLine();

        Set<Notebook> filtered_notebooks = Filtering(notebooks_list, filter, minimum);
        iScanner.close();

        System.out.println("Проходящие по условиям ноутбуки: ");
        for (Notebook notebook : filtered_notebooks) {
            System.out.println(String.format("Producer: %s, CPU: %s, OS: %s, Color: %s, RAM: %d, HDD: %d",
                    notebook.getProducer(), notebook.getCPU(), notebook.getOS(), notebook.getColor(), notebook.getRAM(),
                    notebook.getHDD()));
        }
    }

    public static Set<Notebook> Filtering(Set<Notebook> set, int filter, String value) {
        Set<Notebook> filtered_notebooks = new HashSet<>();

        for (Notebook notebook : set) {
            switch (filter) {
                case 1:
                    if (notebook.getHDD() >= Integer.parseInt(value)) {
                        filtered_notebooks.add(notebook);
                    }
                    break;
                case 2:
                    if (notebook.getRAM() >= Integer.parseInt(value)) {
                        filtered_notebooks.add(notebook);
                    }
                    break;
                case 3:
                    if (notebook.getCPU().equals((value))) {
                        filtered_notebooks.add(notebook);
                    }
                    break;
                case 4:
                    if (notebook.getProducer().equals((value))) {
                        filtered_notebooks.add(notebook);
                    }
                    break;
                case 5:
                    if (notebook.getOS().equals((value))) {
                        filtered_notebooks.add(notebook);
                    }
                    break;
                case 6:
                    if (notebook.getColor().equals((value))) {
                        filtered_notebooks.add(notebook);
                    }
                    break;
            }
        }
        return filtered_notebooks;
    }

}
