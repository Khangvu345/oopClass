import java.util.*;
public class J03008 {
    public static boolean soThuanNghich(String res){
        for (int k = 0; k < res.length(); k++){
            if (res.charAt(k) != res.charAt(res.length() - 1 - k)) return false;
        }
        return true;
    }
    public static boolean soNguyenTo(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean kiemTraDayNguyenTo(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (!soNguyenTo(arr[i])) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String res = sc.nextLine();
            int [] arr = new int[res.length()];
            for (int i = 0; i < res.length(); i++){
                arr[i] = Integer.parseInt(String.valueOf(res.charAt(i)));
            }
            if (kiemTraDayNguyenTo(arr) && soThuanNghich(res)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }       
        }
        sc.close();
    }
}
