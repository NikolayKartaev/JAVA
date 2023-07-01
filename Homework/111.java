import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Model 1", 8, 500, "Windows", "Black");
        Notebook notebook2 = new Notebook("Model 2", 16, 1000, "MacOS", "Silver");
        Notebook notebook3 = new Notebook("Model 3", 12, 750, "Linux", "White");
        // Создайте экземпляры других ноутбуков...

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        // Добавьте остальные ноутбуки в множество...

        filterNotebooks(notebooks);
    }

    private static void filterNotebooks(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int filterOption = scanner.nextInt();
        Map<String, Object> filters = new HashMap<>();

        switch (filterOption) {
            case 1:
                System.out.println("Введите минимальное значение для ОЗУ:");
                int minRam = scanner.nextInt();
                filters.put("minRam", minRam);
                break;
            case 2:
                System.out.println("Введите минимальное значение для объема ЖД:");
                int minStorageSize = scanner.nextInt();
                filters.put("minStorageSize", minStorageSize);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String operatingSystem = scanner.next();
                filters.put("operatingSystem", operatingSystem);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filters.put("color", color);
                break;
            default:
                System.out.println("Некорректный выбор критерия.");
                return;
        }

        // Фильтрация ноутбуков
        Set<Notebook> filteredNotebooks = applyFilters(notebooks, filters);

        // Вывод подходящих ноутбуков
        System.out.println("Подходящие ноутбуки:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println("Модель: " + notebook.getModel());
            System.out.println("ОЗУ: " + notebook.getRam());
            System.out.println("Объем ЖД: " + notebook.getStorageSize());
            System.out.println("Операционная система: " + notebook.getOperatingSystem());
            System.out.println("Цвет: " + notebook.getColor());
            System.out.println();
        }
    }

    private static Set<Notebook> applyFilters(Set<Notebook> notebooks, Map<String, Object> filters) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            boolean passFilter = true;

            // Фильтрация по ОЗУ
            if (filters.containsKey("minRam")) {
                int minRam = (int) filters.get("minRam");
                if (notebook.getRam() < minRam) {
                    passFilter = false;
                }
            }

            // Фильтрация по объему ЖД
            if (filters.containsKey("minStorageSize")) {
                int minStorageSize = (int) filters.get("minStorageSize");
                if (notebook.getStorageSize() < minStorageSize) {
                    passFilter = false;
                }
            }

            // Фильтрация по операционной системе
            if (filters.containsKey("operatingSystem")) {
                String operatingSystem = (String) filters.get("operatingSystem");
                if (!notebook.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                    passFilter = false;
                }
            }

            // Фильтрация по цвету
            if (filters.containsKey("color")) {
                String color = (String) filters.get("color");
                if (!notebook.getColor().equalsIgnoreCase(color)) {
                    passFilter = false;
                }
            }

            if (passFilter) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}