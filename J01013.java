import java.util.Scanner;

public class J01013 {
    public static long tongUocSoNT(int n) {
        long tong = 0;
        if (n % 2 == 0) {
            int count = 0;
            while (n % 2 == 0) {
                count++;
                n /= 2;
            }
            tong += count * 2;
        }
        for (int i = 3; i * i <= n; i += 2) {
            int count = 0;
            if (n % i == 0) {
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                tong += count * i;
            }
        }
        if (n > 1)
            tong += n;
        return tong;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long ketQua = 0;
        while (T-- > 0) { // Xử lý điều kiện cộng dồn kết quả không cần mảng, tối ưu bộ nhớ
            int n = sc.nextInt();
            ketQua += tongUocSoNT(n);
        }
        System.out.println(ketQua);
        sc.close();
    }
}
