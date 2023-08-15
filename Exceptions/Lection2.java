import java.io.FileReader;
import java.io.IOException;

public class Lection2 {

    public static void main(String[] args) {
        Task2();
    }

    public static void task1() {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            System.out.println(test.length());

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        System.out.println(number);
    }

    public static void Task2() {
        FileReader test = null;

        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException e) { // несколько типов исключение через или
            System.out.println("catch exception: " + e.getClass().getSimpleName()); // определение типа выпавшего исключения
        } finally { // исполняется в любом случае (при ошбике и без ошибки)
            System.out.println("finally starts"); 
            if (test != null) {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("exception while close");
                }
            }
            System.out.println("finally finishes");
            
        }

    }
}

