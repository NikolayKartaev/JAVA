package JAVA;

import java.util.List;
import java.util.ArrayList;

public class algorithms {
    public static void main(String[] args) {
        List<Integer> dividers = findDividers(15);
        for (Integer div: dividers) {
            System.out.println(div);
        }
    }
    
    public static List<Integer> findDividers(int number) { 
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <number;i++) { 
            if (number%i==0) { //прямая кореляция (линейная зависимость) - сложность n (напрямую зависит от вхоядщего числа)
                result.add(i);
            }
        }
        return result;
    }
}

// поиск простых чисел (цикл в цикле) - квадратичная зависимость (сложность n**2)