import java.io.*;
import java.util.*;
import java.util.stream.*;

public class J07022 {
    // Hàm kiểm tra xem một chuỗi có phải kiểu int hay không
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        
        try (Scanner sc = new Scanner(new File("DATA.in"))) {
            while (sc.hasNext()) {
                String s = sc.next();
                // Nếu KHÔNG PHẢI kiểu int thì mới thêm vào danh sách
                if (!isInt(s)) {
                    result.add(s);
                }
            }
            // Sử dụng Stream API để sắp xếp và in kết quả
            String output = result.stream()
                .sorted() // Sắp xếp theo thứ tự từ điển
                .collect(Collectors.joining(" ")); // Nối các từ lại bằng dấu cách
            
            System.out.println(output);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}