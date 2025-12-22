import java.util.Scanner;
public class J01014 {
    public static void phanTichThuaSoNT(int number, long n){
        System.out.print("Test "+number+": ");
        if (n % 2 == 0) {
            int count = 0;
            while (n % 2 == 0) {
                count++;
                n /= 2;
            }
            System.out.print("2"+ "(" + count + ") ");
        }

        for (int i = 3; i * i <= n; i += 2) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            System.out.print(i+"("+count+") "); // in ra bị dính cả trường hợp nếu thừa số đó không xuất hiện
        }
        if (n > 1) System.out.print(n+"(1)");
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            long n = sc.nextLong();
            phanTichThuaSoNT(i, n);
        }
        sc.close();
    }
}
