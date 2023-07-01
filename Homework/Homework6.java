package JAVA.Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Homework6 {

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

        Scanner iScanner = new Scanner(System.in, "cp866");
        System.out.println("Введите цифру, соответствующую необходимому критерию:\n"
                + "1 - Объем HDD \n"
                + "2 - Объем ОЗУ \n"
                + "3 - Процессор \n"
                + "4 - Производитель\n"
                + "5 - Операционная система\n"
                + "6 - Цвет");

        int option = iScanner.nextInt();
        Map<String, Object> filters = new HashMap<>();

        switch (option) {
            case 1:
                System.out.println("Введите минимальное значение необходимого объема HDD\n");
                int minHDD = iScanner.nextInt();
                filters.put("minHDD", minHDD);
                break;
            case 2:
                System.out.println("Введите минимальное значение необходимого объема RAM\n");
                int minRAM = iScanner.nextInt();
                filters.put("minRAM", minRAM);
                break;
            case 3:
                System.out.println("Введите значение необходимого процессора\n");
                String CPU = iScanner.next();
                filters.put("CPU", CPU);
                break;
            case 4:
                System.out.println("Введите значение необходимого производителя\n");
                String Producer = iScanner.next();
                filters.put("Producer", Producer);
                break;
            case 5:
                System.out.println("Введите значение необходимой операционной системы\n");
                String OS = iScanner.next();
                filters.put("OS", OS);
                break;
            case 6:
                System.out.println("Введите необходимый цвет ноутбука\n");
                String Color = iScanner.next();
                filters.put("Color", Color);
                break;
        }

        Set<Notebook> filtered_notebooks = Filtering(notebooks_list, filters);

        System.out.println("Проходящие по условиям ноутбуки: ");
        for (Notebook notebook : filtered_notebooks) {
            System.out.println(String.format("Producer: %s, CPU: %s, OS: %s, Color: %s, RAM: %d, HDD: %d",
                    notebook.getProducer(), notebook.getCPU(), notebook.getOS(), notebook.getColor(), notebook.getRAM(),
                    notebook.getHDD()));
        }

        System.out.println("Необходимо ли уточнить фильтрацию? (да/нет)\n");
        iScanner.nextLine();
        String answer = iScanner.nextLine();

        if (answer.equals("да")) {
            System.out.println("Введите цифру, соответствующую необходимому критерию:\n"
                    + "1 - Объем HDD \n"
                    + "2 - Объем ОЗУ \n"
                    + "3 - Процессор \n"
                    + "4 - Производитель\n"
                    + "5 - Операционная система\n"
                    + "6 - Цвет");

            int second_option = iScanner.nextInt();

            switch (second_option) {
                case 1:
                    System.out.println("Введите минимальное значение необходимого объема HDD\n");
                    int minHDD = iScanner.nextInt();
                    filters.put("minHDD", minHDD);
                    break;
                case 2:
                    System.out.println("Введите минимальное значение необходимого объема RAM\n");
                    int minRAM = iScanner.nextInt();
                    filters.put("minRAM", minRAM);
                    break;
                case 3:
                    System.out.println("Введите значение необходимого процессора\n");
                    String CPU = iScanner.next();
                    filters.put("CPU", CPU);
                    break;
                case 4:
                    System.out.println("Введите значение необходимого производителя\n");
                    String Producer = iScanner.next();
                    filters.put("Producer", Producer);
                    break;
                case 5:
                    System.out.println("Введите значение необходимой ОС\n");
                    String OS = iScanner.next();
                    filters.put("OS", OS);
                    break;
                case 6:
                    System.out.println("Введите необходимый цвет ноутбука\n");
                    String Color = iScanner.next();
                    filters.put("Color", Color);
                    break;
            }
            Set<Notebook> second_filtered_notebooks = Filtering(filtered_notebooks, filters);

            PrintList(second_filtered_notebooks);

        } else {
            System.out.println("Ваш список готов.");
            PrintList(filtered_notebooks);
        }

        iScanner.close();

    }

    public static void PrintList(Set<Notebook> list) {
        System.out.println("Проходящие по условиям ноутбуки: ");
        for (Notebook notebook : list) {
            System.out.println(String.format("Producer: %s, CPU: %s, OS: %s, Color: %s, RAM: %d, HDD: %d",
                    notebook.getProducer(), notebook.getCPU(), notebook.getOS(), notebook.getColor(), notebook.getRAM(),
                    notebook.getHDD()));
        }
    }

    public static Set<Notebook> Filtering(Set<Notebook> set, Map<String, Object> HashMap) {
        Set<Notebook> filtered_notebooks = new HashSet<>();

        for (Notebook notebook : set) {
            boolean rightFilter = true;

            if (HashMap.containsKey("minHDD")) {
                int minHDD = (int) HashMap.get("minHDD");
                if (notebook.getHDD() < minHDD) {
                    rightFilter = false;
                }
            }

            if (HashMap.containsKey("minRAM")) {
                int minRAM = (int) HashMap.get("minRAM");
                if (notebook.getRAM() < minRAM) {
                    rightFilter = false;
                }
            }

            if (HashMap.containsKey("CPU")) {
                String CPU = (String) HashMap.get("CPU");
                if (!notebook.getCPU().equals(CPU)) {
                    rightFilter = false;
                }
            }
            if (HashMap.containsKey("Producer")) {
                String Producer = (String) HashMap.get("Producer");
                if (!notebook.getProducer().equals(Producer)) {
                    rightFilter = false;
                }
            }

            if (HashMap.containsKey("OS")) {
                String OS = (String) HashMap.get("OS");
                if (!notebook.getOS().equals(OS)) {
                    rightFilter = false;
                }
            }
            if (HashMap.containsKey("Color")) {
                String Color = (String) HashMap.get("Color");
                if (!notebook.getColor().equals(Color)) {
                    rightFilter = false;
                }
            }

            if (rightFilter) {
                filtered_notebooks.add(notebook);
            }
        }
        return filtered_notebooks;
    }

}
