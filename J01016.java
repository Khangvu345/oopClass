import java.util.Scanner;
public class J01016 {
    public static void check(long n){
        String str = Long.toString(n);
        int tong = 0; 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '4' || str.charAt(i) == '7'){
                tong++; 
            }
        }
        if (tong == 4 || tong == 7) System.out.println("YES");
        else System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        check(n);
        sc.close();
    }
}
