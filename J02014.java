import java.util.Scanner;
public class J02014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long tong = 0;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                tong += a[i];
            }
            System.out.println(diemCanBang(a, tong));
        }    
    }
    public static int diemCanBang(int[] a, long tong){
        long leftSum = 0; // tổng bên trái của vị trí cân bằng
        for (int i = 0; i < a.length; i++) {
            long rightSum = tong - leftSum - a[i]; // tổng bên phải của vị trí cân bằng
            if (leftSum == rightSum) {
                return i + 1;
            }
            leftSum += a[i]; // vì vị trí cân bằng không lấy điểm cân bằng nên phải trừ đi
        }
        return -1;
    }
}
    