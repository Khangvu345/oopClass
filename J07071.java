import java.io.*;
import java.util.stream.*;
import java.util.*;

class Person {
    String fullName;
    String firstName; // Tên (từ cuối cùng)
    String lastName;  // Họ và đệm (các từ còn lại)
    String abbreviation; // Dạng viết tắt (N.V.N)

    public Person(String fullName) {
        this.fullName = fullName;
        String[] words = fullName.split("\\s+");
        this.firstName = words[words.length - 1];
        
        // Lấy phần họ và đệm để sắp xếp khi trùng tên
        StringBuilder sbLastName = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            sbLastName.append(words[i]).append(" ");
        }
        this.lastName = sbLastName.toString().trim();

        // Tạo chuỗi viết tắt (N.V.N)
        StringBuilder sbAbbr = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sbAbbr.append(words[i].charAt(0));
            if (i < words.length - 1) sbAbbr.append(".");
        }
        this.abbreviation = sbAbbr.toString();
    }

    public String getFullName() { return fullName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getAbbreviation() { return abbreviation; }
}

public class J07071 {
    // Hàm kiểm tra độ khớp giữa viết tắt và mẫu (có dấu *)
    public static boolean isMatch(String abbr, String pattern) {
        if (abbr.length() != pattern.length()) return false;
        for (int i = 0; i < abbr.length(); i++) {
            if (pattern.charAt(i) == '*') continue;
            if (abbr.charAt(i) != pattern.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        File file = new File("DANHSACH.in");
        try (Scanner sc = new Scanner(file))
        {
            int n = Integer.parseInt(sc.nextLine());
            List<Person> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new Person(sc.nextLine()));
            }

            // Sắp xếp danh sách theo quy tắc đề bài bằng Java 8 Comparator
            /* Sử dụng :: thay cho lambda để làm gọn code 
            Ví dụ: Person::getFirstName thay cho (p -> p.getFirstName())
            */
            list.sort(Comparator.comparing(Person::getFirstName)
                                .thenComparing(Person::getLastName));

            int m = Integer.parseInt(sc.nextLine());
            while (m-- > 0) {
                String pattern = sc.nextLine();
                
                // Sử dụng Stream API để lọc và in kết quả
                List<String> results = list.stream()
                    .filter(p -> isMatch(p.getAbbreviation(), pattern))
                    .map(Person::getFullName)
                    .collect(Collectors.toList());
                
                results.forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}