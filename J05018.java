import java.util.*;
public class J05018 {
    public static class HocSinh{
        private String maHS, hoTen, xepLoai;
        private float diemTB;
        private static int stt = 0;
        public HocSinh(String hoTen, Float[] diem){
            stt++;
            this.maHS = "HS" + String.format("%02d", stt);
            this.hoTen = hoTen;
            this.diemTB = diemTB(diem);
            this.xepLoai = xepLoai(this.diemTB);
        }
        public float diemTB(Float[] d){
            float tong = 0;
            tong += d[0] * 2 + d[1] *2;
            for (int i = 2; i < d.length; i++){
                tong += d[i];
            }
            float trungBinh = tong / (12f);
            return (float) Math.round(trungBinh * 10.0) / 10.0f;
        }

        public String xepLoai(float diemTB){
            if (diemTB < 5) return "YEU";
            if (diemTB >= 5 && diemTB <= 6.9) return "TB";
            if (diemTB >= 7 && diemTB <= 7.9) return "KHA";
            if (diemTB >= 8 && diemTB <= 8.9) return "GIOI";
            if (diemTB >= 9) return "XUAT SAC";
            return "";
        }
        @Override
        public String toString(){
            return String.format("%s %s %.1f %s", this.maHS, this.hoTen, this.diemTB, this.xepLoai);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> ds = new ArrayList<>();
        while(t-- > 0){
            String hoTen = sc.nextLine();
            Float[] diem = new Float[10];
            for (int i = 0; i < diem.length; i++){
                diem[i] = Float.parseFloat(sc.next());
            }
            sc.nextLine();
            HocSinh hs = new HocSinh(hoTen, diem);
            ds.add(hs);
        }
        Collections.sort(ds, (a,b) ->{
            if (a.diemTB != b.diemTB) return Float.compare(b.diemTB, a.diemTB);
            return a.maHS.compareTo(b.maHS);
        });
        for (HocSinh hs: ds){
            System.out.println(hs);
        }
    }
    
}
import java.util.*;

public class J05018 {
    public static class HocSinh {
        private String maHS, hoTen, xepLoai;
        private double diemTB; // Dùng double để chính xác hơn float
        private static int stt = 0;

        public HocSinh(String hoTen, Double[] diem) {
            this.maHS = String.format("HS%02d", ++stt);
            this.hoTen = hoTen;
            this.diemTB = tinhDiemTB(diem);
            this.xepLoai = phanLoai(this.diemTB);
        }

        private double tinhDiemTB(Double[] d) {
            double tong = 0;
            tong += d[0] * 2 + d[1] * 2;
            for (int i = 2; i < 10; i++) {
                tong += d[i];
            }
            double trungBinh = tong / 12.0;
            // Thêm sai số 1e-9 để làm tròn chuẩn xác hơn trong lập trình thi đấu
            return Math.round(trungBinh * 10.0 + 1e-9) / 10.0;
        }

        private String phanLoai(double dtb) {
            if (dtb >= 9.0) return "XUAT SAC";
            if (dtb >= 8.0) return "GIOI";
            if (dtb >= 7.0) return "KHA";
            if (dtb >= 5.0) return "TB";
            return "YEU";
        }

        @Override
        public String toString() {
            // Sử dụng Locale.US để đảm bảo dấu chấm thập phân
            return String.format(Locale.US, "%s %s %.1f %s", maHS, hoTen, diemTB, xepLoai);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<HocSinh> ds = new ArrayList<>();
        
        while (t-- > 0) {
            String hoTen = sc.nextLine();
            Double[] diem = new Double[10];
            for (int i = 0; i < 10; i++) {
                diem[i] = sc.nextDouble();
            }
            if (sc.hasNextLine()) sc.nextLine(); // Dọn buffer
            
            ds.add(new HocSinh(hoTen, diem));
        }

        Collections.sort(ds, (a, b) -> {
            // So sánh điểm trung bình giảm dần
            if (a.diemTB != b.diemTB) {
                return Double.compare(b.diemTB, a.diemTB);
            }
            // Điểm bằng nhau thì mã HS tăng dần
            return a.maHS.compareTo(b.maHS);
        });

        for (HocSinh hs : ds) {
            System.out.println(hs);
        }
    }
}