import java.util.*;
public class J05003 {
    public static class SinhVien{
        private String maSV, hoTen, lop, ngaySinh;
        private float gpa;
        private static int stt = 0;
        public SinhVien(){
            this.maSV = "B20DCCN" + String.format("%03d", ++stt);
            this.hoTen = "";
            this.lop = "";
            this.ngaySinh = "";
            this.gpa = 0.0f;
        }
        public void setHoTen(String hoTen){
            this.hoTen = hoTen;
        }
        public void setLop(String lop){
            this.lop = lop;
        }
        public void setNgaySinh(String ngaySinh){
            this.ngaySinh = ngaySinh;
        }
        public void setGpa(float gpa){
            this.gpa = gpa;
        }
        public void chuanHoaNgaySinh(){
            String[] parts = this.ngaySinh.split("/");
            StringBuilder sb = new StringBuilder("");
            // Chuẩn hóa ngày
            if (parts[0].length() < 2) sb.append("0").append(parts[0]);
            else sb.append(parts[0]);
            sb.append("/");
            // Chuẩn hóa tháng
            if (parts[1].length() < 2) sb.append("0").append(parts[1]);
            else sb.append(parts[1]);
            sb.append("/");
            // Giữ nguyên năm
            sb.append(parts[2]);
            this.ngaySinh = sb.toString();
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %s %.2f", this.maSV, this.hoTen, this.lop, this.ngaySinh, this.gpa);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            SinhVien sv = new SinhVien(); // Phương pháp khởi tạo không tham số
            sv.setHoTen(sc.nextLine());
            sv.setLop(sc.nextLine());
            sv.setNgaySinh(sc.nextLine());
            sv.setGpa(Float.parseFloat(sc.nextLine()));
            sv.chuanHoaNgaySinh();
            ds.add(sv);
        }
        sc.close();
        for (SinhVien sv: ds){
            System.out.println(sv);
        }
    }
}
