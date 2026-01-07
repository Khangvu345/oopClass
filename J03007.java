import java.util.*;
public class J03007 {
    public static boolean tongChiaHet10(String s){
        int tong = 0;
        for (int i = 0; i < s.length(); i++){
            tong += s.charAt(i) - '0';
        }
        return tong % 10 == 0;
    }
    
    public static boolean check(String s){
        int n = s.length();
        if (s.charAt(0) != '8' && s.charAt(n-1) != '8') return false; // Kiểm tra đầu và cuối phải là 8
        for (int i = 1; i < n/2; i++){ // Có thể lấy = n/2. Tối ưu nhất là lấy n < 2
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            if (check(s) && tongChiaHet10(s)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
