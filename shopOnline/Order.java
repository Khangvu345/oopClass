package shopOnline;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> danhSachSanPham;
    private PaymentMethod phuongThucThanhToan;

    public Order(PaymentMethod phuongThucThanhToan) {
        this.danhSachSanPham = new ArrayList<>();
        this.phuongThucThanhToan = phuongThucThanhToan;
    }
    public void themSanPham(Product sanPham) {
        danhSachSanPham.add(sanPham);
    }
    public double tinhTongTien() {
        double tongTien = 0;
        for (Product sanPham : danhSachSanPham) {
            tongTien += sanPham.getGia();
        }
        return tongTien;
    }
    public void checkout() {
        double tongTien = tinhTongTien();
        phuongThucThanhToan.thanhToan(tongTien);
    }
}
