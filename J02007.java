import java.util.Scanner;
public class J02007 {
    public static void demSoXH(int i, int[] a){
        System.out.println("Test " + i + ": ");
        int [] count = new int[100001];
        for (int j = 0; j < a.length; j++) {
            count[a[j]]++;
        }
        // Chú ý testcase yêu cầu in ra theo thứ tự xuất hiện
        for (int j = 0; j < a.length; j++) {
            if (count[a[j]] > 0){
                System.out.println(a[j]+" xuat hien "+count[a[j]]+" lan");
                count[a[j]] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            demSoXH(i, a);
        }
        sc.close();
    }
}
