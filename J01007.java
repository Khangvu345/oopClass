import java.util.Scanner;
public class J01007 {
    public static String checkFibo(long n){
        if ( n < 0) {
            return "NO";
        }
        long a = 0;
        long b = 1;
        while (b < n) {
            long next = a + b;
            a = b;
            b = next;
        }
        if (b == n || n == 0 || n == 1) return "YES";
        return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long n = sc.nextLong();
            System.out.println(checkFibo(n));
            T--;
        }
        sc.close();
    }
}
