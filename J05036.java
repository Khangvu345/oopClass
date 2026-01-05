import java.util.*;
public class J05036 {
    public static class HangBan {
        private static int count = 0; // Biến chung để đếm số lượng hàng được tạo ra
        private String maHang;
        private String tenHang;
        private String donViTinh;
        private int donGiaNhap;
        private int soLuong;
        public HangBan(String tenHang, String donViTinh, int donGiaNhap, int soLuong){
            count++; 
            this.maHang = "MH" + String.format("%02d", count); //Cách tạo ra mã đơn hàng tự động
            this.tenHang = tenHang;
            this.donViTinh = donViTinh;
            this.donGiaNhap = donGiaNhap;
            this.soLuong = soLuong;
        }

        public long phiVanChuyen(){ // Không sử dụng hàm static khi tính toán nhiều đối tượng
            return Math.round(this.donGiaNhap * this.soLuong * 0.05);
        }

        public long thanhTien(){
            return Math.round(this.donGiaNhap * this.soLuong + this.phiVanChuyen());
        }

        public long giaBan(){
            return Math.round(this.thanhTien() * 1.02);
        }
        
        @Override 
        public String toString(){
            return this.maHang + " " + this.tenHang + " " + this.donViTinh + " "  + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String tenHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int donGiaNhap = Integer.parseInt(sc.nextLine());
            int soLuong = Integer.parseInt(sc.nextLine());
            HangBan hangBan = new HangBan(tenHang, donViTinh, donGiaNhap, soLuong);
            System.out.println(hangBan);
        }
        
    }
}
