package shopOnline;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product laptop = new ElectronicProduct("P001", "Laptop ABC", 20000000, "IMEI12345", 24);
        Product phone = new ElectronicProduct("P002", "Phone XYZ", 15000000, "IMEI67890", 12);
        Product milk = new FoodProduct("P003", "Sữa tươi", 30000, "30/12/2025");
        Product bread = new FoodProduct("P004", "Bánh mì", 5000, "10/10/2025");

        PaymentMethod cash = new CashPayment();
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod momo = new MomoPayment();

        System.out.println("- Khách hàng Nguyễn Văn A mua hàng, thanh toán bằng tiền mặt -");
        Order order1 = new Order(cash);
        order1.themSanPham(laptop); 
        order1.themSanPham(milk); 

        System.out.println("Khách hàng: Nguyễn Văn A. Tổng tiền: " + order1.tinhTongTien());
        order1.checkout();

        System.out.println("\n- KỊCH BẢN 2: Khách hàng Trần Thị B mua hàng, thanh toán bằng thẻ -");
        Order order2 = new Order(creditCard);
        order2.themSanPham(phone);
        order2.themSanPham(bread);
        order2.themSanPham(milk);

        System.out.println("Khách hàng: Trần Thị B. Tổng tiền: " + order2.tinhTongTien());
        order2.checkout();
    }
}
