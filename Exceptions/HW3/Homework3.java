import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Cp1251");
        try {
            
            // String input = scanner.nextLine(); 
            String input = "Картаев Николай Сергеевич 03011987 89067335504 m";
            String[] inputData = input.split(" ");

            if (inputData.length != 6) {
                throw new NotCorrectInputException("Неверное количество данных");
            }

            String lastName = inputData[0];
            String firstName = inputData[1];
            String middleName = inputData[2];
            String birthDate = inputData[3];
            String phoneNumber = inputData[4];
            char gender = inputData[5].charAt(0);

            Userdata userData = new Userdata(lastName, firstName, middleName, birthDate, phoneNumber, gender);

            try (FileWriter fileWriter = new FileWriter(lastName+".txt", Charset.forName("Cp1251"))) {
                fileWriter.write(userData.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NotCorrectInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
