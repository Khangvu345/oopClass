import java.util.Scanner;

public class J01013 {
    // Giới hạn đề bài thường là 2.000.000
    static final int MAX = 2000000;
    static int[] minPrime = new int[MAX + 1];

    // Hàm sàng ước số nguyên tố nhỏ nhất
    public static void sieve() {
        for (int i = 2; i * i <= MAX; i++) {
            if (minPrime[i] == 0) { // i là số nguyên tố
                for (int j = i * i; j <= MAX; j += i) {
                    if (minPrime[j] == 0) {
                        minPrime[j] = i;
                    }
                }
            }
        }
        // Các số còn lại là số nguyên tố thì ước nhỏ nhất là chính nó
        for (int i = 2; i <= MAX; i++) {
            if (minPrime[i] == 0) {
                minPrime[i] = i;
            }
        }
    }

    public static void main(String[] args) {
        sieve(); // Chạy sàng 1 lần duy nhất
        
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            long totalSum = 0;
            while (t-- > 0) {
                int n = sc.nextInt();
                // Phân tích n cực nhanh dựa trên mảng minPrime
                while (n > 1) {
                    int p = minPrime[n];
                    // Nếu n là số lớn, p có thể là ước nguyên tố
                    // Ví dụ n=12, p=2 -> n=6, p=2 -> n=3, p=3
                    totalSum += p;
                    n /= p;
                }
            }
            System.out.println(totalSum);
        }
        sc.close();
    }
}