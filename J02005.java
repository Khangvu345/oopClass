import java.util.Scanner;

public class J02005 {
    public static void giao(int[] a, int[] b) {
        // Đánh dấu các phần tử có trong mảng a
        int[] count = new int[1001];
        for (int i = 0; i < a.length; i++) {
            count[a[i]] = 1;
        }

        // Đánh dấu các phần tử giao (có trong cả a và b)
        int[] giao = new int[1001];
        for (int i = 0; i < b.length; i++) {
            if (count[b[i]] == 1) {
                giao[b[i]] = 1; // Đánh dấu phần tử này thuộc giao
            }
        }

        // In ra các phần tử giao theo thứ tự tăng dần
        for (int i = 0; i < giao.length; i++) {
            if (giao[i] == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        giao(a, b);
        sc.close();
    }
}
