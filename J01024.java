import java.util.Scanner;

public class J01024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Đọc số bộ test
        if (sc.hasNextInt()) {
            int t = Integer.parseInt(sc.nextLine()); 
            
            while (t-- > 0) {
                String s = sc.nextLine();
                if (checkTamPhan(s)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
//Sử dụng kiểm tra trực tiếp theo định nghĩa bằng kiểu dữ liệu char và toán tử logic 
    // Hàm kiểm tra số tam phân
    public static boolean checkTamPhan(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Nếu ký tự không thuộc {0, 1, 2}
            if (c != '0' && c != '1' && c != '2') {
                return false;
            }
        }
        return true;
    }
}
