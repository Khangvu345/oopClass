import java.util.Scanner;
public class J01018 {
    public static void check(String str){
        int tong = 0;
        for (int i = 0; i < str.length(); i++) {
            tong += str.charAt(i) - '0';
        }
        char [] arr = str.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i-1]) != 2 || (tong % 10 != 0)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String str = sc.next();
            check(str);
        }
        sc.close();
    }
}
// chú ý điều kiện toán tử || và &&. Cần vẻ bảng chân lý để rõ nhất