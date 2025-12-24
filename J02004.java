import java.util.Scanner;

public class J02004 {
    public static void check(int[] arr) {
        boolean doiXung = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                doiXung = false;
                break;
            }
        }
        if (doiXung) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // Cách nhập mảng từ input
            }
            check(arr);
        }
        sc.close();
    }
}
