import java.util.*;

public class J05027 {
    public static class GiangVien {
        private String maGV, hoTen, monVietTat, hoTenLower;
        private static int count = 0;

        public GiangVien(String hoTen, String monDay) {
            this.maGV = String.format("GV%02d", ++count);
            this.hoTen = hoTen;
            this.monVietTat = taoMonVietTat(monDay);
            // Lưu thêm một bản họ tên viết thường để tìm kiếm cho nhanh
            this.hoTenLower = hoTen.toLowerCase();
        }

        public static String taoMonVietTat(String mon) {
            String[] words = mon.trim().split("\\s+");
            StringBuilder res = new StringBuilder();
            for (String w : words) {
                res.append(Character.toUpperCase(w.charAt(0)));
            }
            return res.toString();
        }

        public String getHoTenLower() {
            return hoTenLower;
        }

        @Override
        public String toString() {
            return String.format("%s %s %s", maGV, hoTen, monVietTat);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Nhập danh sách giảng viên
        if (!sc.hasNextInt()) return;
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<GiangVien> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ds.add(new GiangVien(sc.nextLine(), sc.nextLine()));
        }

        // 2. Nhập số lượng truy vấn
        if (!sc.hasNextInt()) return;
        int q = Integer.parseInt(sc.nextLine());
        
        while (q-- > 0) {
            String query = sc.nextLine();
            // Tiêu đề in ra từ khóa gốc người dùng nhập
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + query + ":");
            
            // Chuyển từ khóa sang chữ thường để tìm kiếm không phân biệt hoa thường
            String key = query.toLowerCase();
            
            // 3. Duyệt và kiểm tra gần đúng
            for (GiangVien gv : ds) {
                if (gv.getHoTenLower().contains(key)) {
                    System.out.println(gv);
                }
            }
        }
        sc.close();
    }
}