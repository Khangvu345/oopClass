import java.util.*;
public class J05006 {
    public static class NhanVien{
        private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, ngayKyHopDong, maSoThue;
        private static int count = 0;
        public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong){
            this.maNV = String.format("%05d", ++count);
            this.hoTen = hoTen;
            this.gioiTinh = gioiTinh;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.maSoThue = maSoThue;
            this.ngayKyHopDong = ngayKyHopDong;
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s %s %s %s", this.maNV, this.hoTen, this.gioiTinh, this.ngaySinh, this.diaChi, this.maSoThue, this.ngayKyHopDong);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> ds = new ArrayList<>();
        while (t-- > 0){
            String hoTen = sc.nextLine();
            String gioiTinh = sc.nextLine();
            String ngaySinh = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSoThue = sc.nextLine();
            String ngayKyHopDong = sc.nextLine();
            NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);
            ds.add(nv);
        }
        sc.close();
        for (NhanVien nv: ds){
            System.out.println(nv);
        }
    }
}
