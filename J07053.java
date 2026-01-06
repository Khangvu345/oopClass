import java.util.*;
import java.io.*;
public class J07053 {
    public static class ThiSinh{
        private String hoTen, ngaySinh, ma;
        private float diemLT, diemTH;
        private int tuoi, diemTong;
        private static int count = 0;
        public ThiSinh(String hoTen, String ngaySinh, float diemLT, float diemTH){
            count++;
            this.ma = this.setMa();
            this.hoTen = this.setHoTen(hoTen);
            this.tuoi = this.tinhTuoi(ngaySinh);
            this.diemLT = diemLT;
            this.diemTH = diemTH;
            this.diemTong = this.tinhDiem();
        }

        public String setMa(){
            return String.format("PH%02d", count);
        }
        // Lỗi 1: chưa truyền tham số vào hàm hay gặp và sử dụng this.hoTen khi chưa truyền tham số mà ở constructor cũng chưa nhận giá trị
        public String setHoTen(String hoTen){
            String[] tenChuaChuanHoa = hoTen.split("\\s+");
            StringBuilder tenChuanHoa = new StringBuilder();
            for (String res : tenChuaChuanHoa){
                if (!res.isEmpty()){
                    tenChuanHoa.append(res.substring(0,1).toUpperCase() + res.substring(1).toLowerCase() + " ");
                }
            }
            return tenChuanHoa.toString().trim();
        }
        
        // lỖI 4: logic này bị hiểu là có 2 lần if không liền mạnh
        public float tinhDiemThuong(){
            if (this.diemLT >= 8 && this.diemTH >= 8) 
                return 1f;
            else if (this.diemLT >= 7.5 && this.diemTH >= 7.5) 
                return 0.5f;
            else 
                return 0f;
        }

        public static int tinhTuoi(String ngaySinh){
            String[] ngaySinhChuoi = ngaySinh.split("/");
            for (String res: ngaySinhChuoi){
                if (!res.isEmpty())
                if (res.length() == 4) return 2026 - Integer.parseInt(res);
            }
            return 0;
        }

        /*
          Chú ý phần này chưa rõ làm tròn thế nào, theo logic trả về float thì sẽ làm tròn ở dạng số thực
          Nhưng theo yêu cầu thì lại in ra số nguyên
         */
        // Code dưới là yêu cầu của đề bài
        // Lỗi 3: Số thao tác với toán tử trong kiểu float thì phải có số thực
        public int tinhDiem(){
            float diemTB = (this.diemLT + this.diemTH) / 2f + this.tinhDiemThuong();
            int lamTron  = (int) Math.round(diemTB);
            return Math.min(10, lamTron);
        }

        // Lỗi 2: Logic so sánh bị sai nếu chưa chặt chẽ
        public String xepLoai(){
            if (this.diemTong < 5) return "Truot";
            if (this.diemTong <= 6) return "Trung binh";
            if (this.diemTong == 7) return "Kha";
            if (this.diemTong == 8) return "Gioi";
            return "Xuat sac";
        }

        @Override
        public String toString(){
            return String.format("%s %s %s %s %s", this.ma, this.hoTen, this.tuoi, this.tinhDiem(), this.xepLoai());
        }
    }
    public static void main(String[] args){
        File file = new File("XETTUYEN.in");
        try(Scanner sc = new Scanner(file)){
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0){
                String hoTen = sc.nextLine();
                String ngaySinh = sc.nextLine();
                float diemLT = Float.parseFloat(sc.nextLine());
                float diemTH = Float.parseFloat(sc.nextLine());
                ThiSinh ts = new ThiSinh(hoTen, ngaySinh, diemLT, diemTH);
                System.out.println(ts);
            } 
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
