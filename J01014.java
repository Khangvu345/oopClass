import java.util.Scanner;
public class J01014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long N = scanner.nextLong();
            System.out.println((uocNguyenToMax(N)));
        }
        scanner.close();
    }
    public static long uocNguyenToMax(long n) {
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        if (n > 2) {
            maxPrime = n;
        }
        return maxPrime;
    }
}