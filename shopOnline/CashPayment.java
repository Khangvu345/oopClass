package shopOnline;

public class CashPayment implements PaymentMethod {
    @Override
    public void thanhToan(double giaTien) {
        System.out.println("Thanh toán tiền mặt: " + giaTien);
    }
}
