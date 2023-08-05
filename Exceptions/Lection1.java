import java.io.File;

public class Lection1 {

    public static void main(String[] args) {
        // System.out.println(GetFileSize(new File("file.txt")));

        // System.out.println(divider(10, 0));

        // int[] array = new int[10];
        // System.out.println(array[111]); // Exception in thread "main"
        // java.lang.ArrayIndexOutOfBoundsException: Index 111 out of bounds for length
        // 10

        // a(); // stack trace

        divider2(10, 0);

    }

    public static long GetFileSize(File file) {
        if (!file.exists()) {
            return -1L; // код ошибки
        }
        return file.length();
    }

    public static int divider(int a, int b) {
        if (b == 0) {
            return -1; // в данном случае код ошибки использовать нельзя, поскольку этот код может быть
                       // результатом верного деления
        }
        return a / b; // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        int[] array = new int[10];
        System.out.println(array[111]);
    }

    public static int divider2(int a, int b) {
        if (b ==0) {
            throw new RuntimeException("Divide by zero is not possible");
        }
        return a/b;
    }
}