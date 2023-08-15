import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;

public class Seminar2 {

    public static void main(String[] args) {
        // SaveToFile("Seminar2");
        ReadFile("Seminar2");
    }

    public static void SaveToFile(String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename + ".txt", Charset.forName("utf-8"));
            fileWriter.append("Анна=4\n\n");
            fileWriter.append("Елена=5\n\n");
            fileWriter.append("Марина=6\n\n");
            fileWriter.append("Владимир=?\n\n");
            fileWriter.append("Константин=?\n\n");
            fileWriter.append("Иван=4\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Файл не создан");
        }

    }

    public static void ReadFile(String filename) {
        BufferedReader fileinfo = null;
        try {
            fileinfo = new BufferedReader(new FileReader(filename + ".txt", Charset.forName("utf-8")));
            String line = null;
            int number = 0;

            while ((line = fileinfo.readLine()) != null) {
                number++;
            }

            String[][] result = new String[number][2];
            fileinfo.close();
            fileinfo = new BufferedReader(new FileReader(filename + ".txt", Charset.forName("utf-8")));

            // int row = 0;
            // while ((line = fileinfo.readLine()) != null) {
            //     String[] dividedArr = line.split("=");
            //     if (dividedArr.length == 2) {
            //         result[row][0] = dividedArr[0].trim();
            //         result[row][1] = dividedArr[1].trim();
            //         row++;
            //     } else { System.out.println("Ошибка в строке "+line);}

            //     for (int i = 0; i < result.length; i++) {
            //         System.out.println(result[i][0] + "=" + result[i][1]);
            //     }
            // }
                
            
            
            
        } catch (Exception e) {
            System.out.println("Ошибка в массиве");
        }
    }

}
