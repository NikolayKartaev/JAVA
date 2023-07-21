package JAVA.Seminars.OOP.Seminar4.ui;
import java.util.Scanner;
import JAVA.Seminars.OOP.Seminar4.presenter.Presenter;





public class ConsoleUI implements View {

    private Presenter presenter; // ссылка на Presenter
    private Scanner scanner; // ввод данных от пользователя


    public ConsoleUI() { // конструктор запускает сканер и связь с презентером
        scanner = new Scanner(System.in); 
        presenter = new Presenter(this); // View создает Presenter. this - сообщается о данном View
    }



    public void start() { // метод постоянного общения с пользователем
        while (true) {      
            String city = scan(); // в переменную возвращаем город из сканера
            presenter.getInfo(city);
        }
    }


    private String scan() { // метод запрашивающий город
        System.out.println("Введите город: ");
        return scanner.nextLine(); 
    }



    public void print(String text) {
        System.out.println(text);
    }
}
