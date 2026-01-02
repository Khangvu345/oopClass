import java.util.*;
import java.io.*;
public class J07021 {
    public static void main(String[] args) {
        File file = new File("DATA.in");
        try (Scanner sc = new Scanner(file))
        {
            while (sc.hasNextLine()) 
            {
                String line = sc.nextLine().trim();
                
                // Điều kiện kết thúc
                if (line.equalsIgnoreCase("END")) {
                    break;
                }
                
                // Nếu dòng trống thì bỏ qua
                if (line.isEmpty()) continue;

                // Tách các từ dựa trên một hoặc nhiều khoảng trắng
                String[] words = line.split("\\s+");
                StringBuilder result = new StringBuilder();

                for (String word : words) {
                    // Chuyển về chữ thường hết trước
                    word = word.toLowerCase();
                    
                    // Viết hoa chữ đầu + ghép phần còn lại
                    String normalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                    
                    result.append(normalizedWord).append(" ");
                }

                // In kết quả và dùng trim() để bỏ dấu cách thừa cuối cùng
                System.out.println(result.toString().trim());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
