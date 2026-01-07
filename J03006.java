import java.util.*;
public class J03006 {
    public static boolean isEven(char c){
        int n = c - '0'; // Cách chuyển 1 kí tự kiểu char về kiểu int trong phạm vi từ 0-9
        return n % 2 == 0;
    }
    public static boolean check(String s){
        int n = s.length();
        for (int i = 0; i < n / 2; i++)
        {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
            if (!isEven(s.charAt(i)) || !isEven(s.charAt(n-i-1))) return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String res = sc.nextLine();
            if (check(res)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
