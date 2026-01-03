import java.util.Scanner;
public class J01012 {
    public static int soUocSoChiaHetCho2(int n){
        if (n % 2 != 0) return 0;
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) // duyệt từ 1 đến căn bậc 2 của n{
            if (n % i == 0) {
                if (i % 2 == 0) count++;
                int temp = n/i;
                if ( temp != i && temp % 2 == 0) count++; // điều kiện để trừ trường hợp lặp của số chính phương
            }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(soUocSoChiaHetCho2(n));
        }
        sc.close();
    }
}