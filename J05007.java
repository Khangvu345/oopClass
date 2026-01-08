import java.util.*;

public class J05007 {
    public static class NhanVien {
        private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong;
        private static int count = 0;
        // Thêm các biến int để phục vụ việc sắp xếp nhanh
        private int ngay, thang, nam;

        public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) {
            this.maNV = String.format("%05d", ++count);
            this.hoTen = hoTen;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.maSoThue = maSoThue;
            this.ngayKyHopDong = ngayKyHopDong;
            
            // Tách ngày sinh ngay khi khởi tạo để dùng cho sắp xếp
            String[] p = ngaySinh.split("/");
            this.ngay = Integer.parseInt(p[0]);
            this.thang = Integer.parseInt(p[1]);
            this.nam = Integer.parseInt(p[2]);
        }

        // Getter cho năm, tháng, ngày để dùng trong Comparator
        public int getNam() { return nam; }
        public int getThang() { return thang; }
        public int getNgay() { return ngay; }

        @Override
        public String toString() {
            return String.format("%s %s %s %s %s %s %s", 
                maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            ds.add(new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                               sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        // Sắp xếp: Già nhất (Năm sinh nhỏ) đứng trước
        Collections.sort(ds, (d1, d2) -> {
            if (d1.getNam() != d2.getNam()) return d1.getNam() - d2.getNam();
            if (d1.getThang() != d2.getThang()) return d1.getThang() - d2.getThang();
            return d1.getNgay() - d2.getNgay();
        });

        for (NhanVien nv : ds) {
            System.out.println(nv);
        }   
        sc.close();
    }
}