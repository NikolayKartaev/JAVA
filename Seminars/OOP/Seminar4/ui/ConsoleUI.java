package JAVA.Seminars.OOP.Seminar4.ui;

import java.util.Scanner;

import JAVA.Seminars.OOP.Seminar4.presenter.Presenter;

public class ConsoleUI implements View {

    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }

    public void start() {
        while (true) {
            String city = scan();
            presenter.getInfo(city);
        }
    }

    private String scan() {
        System.out.println("Введите город: ");
        return scanner.nextLine();
    }

    public void print(String text) {
        System.out.println(text);
    }
}
