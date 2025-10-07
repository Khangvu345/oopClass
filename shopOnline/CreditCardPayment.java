package shopOnline;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void thanhToan(double giaTien) {
        System.out.println("Thanh toán bằng thẻ tín dụng: " + giaTien);
    }
    
}
