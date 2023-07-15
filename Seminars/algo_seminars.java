package JAVA.Seminars;

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

    // ДОБАВИТЬ КОНСПЕКТ 2-ого СЕМИНАРА

    // СЕМИНАР 4

    // ХЕШ-ТАБЛИЦА

    public class HashMap {

        class Entity {
            int key;
            int value;
        }

        class Basket {
            static Node head;

            class Node {
                Node next;
                Entity entity;
            }

            public static Integer find (int key) {
                Node node = head;
                while (node!=null) {
                    if(node.entity.key == key) {
                        return node.entity.value;
                    }
                }
                return null;
            }

        }

        final static int INIT_SIZE = 16;
        private static Basket[] baskets;

        public HashMap(int size) {
            baskets = new Basket[size];
        }

        public HashMap() {
            this(INIT_SIZE);
        }

        private static int getIndex(int key) {
            return key%baskets.length;
        }

        public static Integer find (int key) {
            int index = getIndex(key);
            Basket basket = baskets[index];
            if (basket == null) {
                return null;
            }
            return Basket.find(key);
        }
        
    }

}
