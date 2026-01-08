import java.util.*;

public class J05022 {
    // Class Sinh Vien
    public static class SV {
        private String maSV, hoTen, lop, email;

        public SV(String maSV, String hoTen, String lop, String email) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.lop = lop;
            this.email = email;
        }

        @Override
        public String toString() {
            return maSV + " " + hoTen + " " + lop + " " + email;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Đọc số lượng sinh viên
        if (!sc.hasNextInt()) return;
        int n = Integer.parseInt(sc.nextLine());
        
        // 2. Sử dụng HashMap để nhóm sinh viên theo lớp
        // Key là tên lớp, Value là danh sách sinh viên của lớp đó
        HashMap<String, ArrayList<SV>> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SV sv = new SV(ma, ten, lop, email);
            
            // Nếu lớp này chưa có trong map, tạo mới một ArrayList
            if (!map.containsKey(lop)) {
                map.put(lop, new ArrayList<>());
            }
            // Thêm sinh viên vào danh sách của lớp tương ứng
            map.get(lop).add(sv);
        }
        
        // 3. Đọc số lượng truy vấn
        if (!sc.hasNextInt()) return;
        int q = Integer.parseInt(sc.nextLine());
        
        while (q-- > 0) {
            String queryLop = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + queryLop + ":");
            
            // Lấy danh sách sinh viên từ Map và in ra
            if (map.containsKey(queryLop)) {
                ArrayList<SV> danhSachLop = map.get(queryLop);
                for (SV sv : danhSachLop) {
                    System.out.println(sv);
                }
            }
        }
        sc.close();
    }
}