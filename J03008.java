import java.util.*;
public class J03008 {
    // Vì duyệt từng chữ số mà số nguyên tố chỉ có 2,3,5,7 là 1 chữ số
    public static boolean laSoNguyenTo(char c){
        if (c == '2' || c == '3' || c == '5' || c == '7') return true;
        return false;
    }
    public static boolean check(String s){
        int n = s.length();
        for (int i = 0; i <= n/2; i++) //Vì duyệt chuỗi thuận nghịch nên đến n/2 là đủ
        {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
            if (!laSoNguyenTo(s.charAt(i)) || !laSoNguyenTo(s.charAt(n-i-1))) return false;
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
