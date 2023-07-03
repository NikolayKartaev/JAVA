package JAVA.Seminars;

import java.util.ArrayList;
import java.util.List;

public class algo_seminars {

    public static int FindSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static long Fibo(int N) {
        if (N <= 2) {
            return 1;
        }
        return Fibo(N - 1) + Fibo(N - 2);
    }

    public static long Fibo2(int N) {
        if (N <= 2) {
            return 1;
        }
        long[] F = new long[N + 1];
        F[1] = 1;
        F[2] = 1;

        for (int i = 3; i <= N; i++) {
            F[i] = F[i - 1] + F[i - 2];            
        }
        
        return F[N];
    }

    public static void main(String[] args) {

        // System.out.println(FindSum(5));
        Fibo2(10);
    }

}
