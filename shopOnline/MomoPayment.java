package shopOnline;

public class MomoPayment implements PaymentMethod {
    @Override
    public void thanhToan(double giaTien) {
        System.out.println("Thanh toán qua Momo: " + giaTien);
    }

}
