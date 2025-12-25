import java.io.File;
import java.util.Scanner;
public class J07002 {
    /* Sử dụng try catch để bắt các trường hợp cần lấy khi đọc file (không chỉ bắt lỗi) */
    // Sử dụng method next() để đọc từng token, dừng lại khi gặp khoảng trắng hoặc xuống dòng
    public static long res(String s){
        try {
            int n = Integer.parseInt(s);
            return n;
        } catch (Exception e) {
            return 0;
        }    
    }
    public static void main(String[] args){
        File file = new File("DATA.in");
        try (Scanner sc = new Scanner(file))
        {
            long sum = 0;
            while (sc.hasNext()){
                sum += res(sc.next());
            }
            System.out.println(sum);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
