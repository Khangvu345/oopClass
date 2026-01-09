import java.util.*;

public class J03025 {
    public static boolean solve(String s){
        int n = s.length();
        int count = 0; // dem so cap phan tu khac nhau
        for(int i = 0; i < n / 2; i++){
            if (s.charAt(i) != s.charAt(n - i - 1)) count++;
        }    
        // Neu la 1 cap thi se thay doi duoc thanh xau doi xung
        if (count == 1) return true;
        if (count == 0) {
            // Neu la 0 cap thi chi can kiem tra xem so luong phan tu co phai la so le khong
            if (n % 2 !=0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String res = sc.nextLine();
            if (solve(res)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
    
}
