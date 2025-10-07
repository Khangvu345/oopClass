package shopOnline;

public class FoodProduct extends Product {
    private String hanSuDung; // Hạn sử dụng
    public FoodProduct(String maSP, String tenSP, double gia, String hanSuDung) {
        super(maSP, tenSP, gia);
        this.hanSuDung = hanSuDung;
    }
    public String getHanSuDung() {
        return hanSuDung;
    }
    public String getInfo() {
        return "Food Product: " + this.getTenSP() + " (Code: " + this.getMaSP() + ") - Price: " + this.getGia() + " - Hạn sử dụng: " + this.hanSuDung;
    }
}
