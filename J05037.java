import java.util.*;
public class J05037 {
    public static class HangHoa {
        private static int count = 0;
        private String maHang, tenHang, donViTinh;
        private int donGiaNhap, soLuong;
        public HangHoa(String tenHang, String donViTinh, int donGiaNhap, int soLuong){
            count++;
            this.maHang = "MH" + String.format("%02d", count);
            this.tenHang = tenHang;
            this.donViTinh = donViTinh;
            this.donGiaNhap = donGiaNhap;
            this.soLuong = soLuong;
        }
        
        public long phiVanChuyen(){
            return Math.round(this.donGiaNhap * this.soLuong * 0.05);
        }

        public long thanhTien(){
            return Math.round(this.donGiaNhap * this.soLuong + this.phiVanChuyen());
        }
        // Quy tắc làm tròn lên và làm tròn tới hàng trăm/chục/nghìn. Còn đơn vị thì không cần
        public long giaBanLe(){
            double giaBanLe = (this.thanhTien() * 1.02) / this.soLuong; // Lưu ý khi ép kiểu xuống
            return (long) Math.ceil(giaBanLe / 100.0) * 100;
        }
        @Override
        public String toString(){
            return this.maHang + " " + this.tenHang + " " + this.donViTinh + " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBanLe();
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<HangHoa> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String tenHang = sc.nextLine();
            String donViTinh = sc.nextLine();
            int donGiaNhap = Integer.parseInt(sc.nextLine());
            int soLuong = Integer.parseInt(sc.nextLine());
            HangHoa hangHoa = new HangHoa(tenHang, donViTinh, donGiaNhap, soLuong);
            ds.add(hangHoa);
        }
        sc.close();
        //So sánh 1 điều kiện bằng hàm lambda
        Collections.sort(ds, (d1,d2) -> Long.compare(d2.giaBanLe(), d1.giaBanLe()));
        for (HangHoa hangHoa : ds) {
            System.out.println(hangHoa);
        }
    }
}
