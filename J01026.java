import java.util.Scanner;

public class J01026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            
            while (t-- > 0) {
                int n = sc.nextInt();
                
                if (laSoChinhPhuong(n)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    
    public static boolean laSoChinhPhuong(long n) {
        if (n < 0) return false;
        
        // Bước 1: Tính căn bậc hai
        int sq = (int) Math.sqrt(n);
        
        // Bước 2: Kiểm tra xem bình phương của phần nguyên có bằng n không
        return (sq * sq == n); // Kiểm tra bằng mệnh đề rút gọn
    }
}
