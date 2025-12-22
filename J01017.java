import java.util.Scanner;
public class J01017 {
    public static void check(long n){
        String str = Long.toString(n);
        char[] arr = str.toCharArray(); // lần đầu dùng kiểu dữ liệu char =)).
        // Kiểu dữ liệu này xử gọn bài trừ 2 số liền kề
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i] - arr[i-1]) != 1) { // thực chất trừ được là do kiểu dữ liệu char, tìm hiểu thêm
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
            long n = sc.nextLong();
            check(n);
        }
        sc.close();
    }
}
//Chú ý cần lấy cả trường hợp -1 nên dùng Abs là chuẩn 