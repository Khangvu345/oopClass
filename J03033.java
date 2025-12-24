import java.util.Scanner;
import java.math.BigInteger;
public class J03033 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger ucln = a.gcd(b);
            BigInteger bcnn = a.multiply(b).divide(ucln);
            System.out.println(bcnn);
        }
        sc.close();
    }
}
