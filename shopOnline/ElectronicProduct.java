package shopOnline;

public class ElectronicProduct extends Product {
    private String IMEI;
    private int thoiGianBaoHanh;

    public ElectronicProduct(String maSP, String tenSP, double gia, String IMEI, int thoiGianBaoHanh) {
        super(maSP, tenSP, gia);
        this.IMEI = IMEI;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getIMEI() {
        return IMEI;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    
    public String getInfo() {
        return "Electronic Product: " + this.getTenSP() + " (Code: " + this.getMaSP() + ") - Price: " + this.getGia() + " - IMEI: " + this.IMEI + " - Warranty: " + this.thoiGianBaoHanh + " months";
    }
}
