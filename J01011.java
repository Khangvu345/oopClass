import java.util.Scanner;
public class J01011 {
    public static long UCLN(long a, long b){
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long BCNN(long a, long b){
        return (a/UCLN(a, b))*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(BCNN(a, b)+" "+UCLN(a, b));
        }
        sc.close();
    }
}
