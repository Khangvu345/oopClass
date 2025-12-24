import java.util.Scanner;
public class J02006 {
    public static void hop(int[] a, int[] b) {
        int[] hop = new int[1001];
        for (int i = 0; i < a.length; i++) {
            if (hop[a[i]] == 0) {
                hop[a[i]] = 1;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (hop[b[i]] == 0) {
                hop[b[i]] = 1;
            }
        }
        for (int i = 0; i < hop.length; i++) {
            if (hop[i] == 1) {
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
        hop(a, b);
        sc.close();
    }
}