import java.util.Scanner;

public class J01006 {
    public static long fibo(int i) {
        if (i <= 1) return i;
        long a = 0;
        long b = 1;
        for (int j = 2; j <= i; j++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int i = sc.nextInt();
            System.out.println(fibo(i));
            n--;
        }
        sc.close();
    }
}