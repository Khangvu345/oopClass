import java.util.*;
public class J05004 {
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
        // Ôn tập viết hàm chuẩn hóa tên 
        public void setHoTen(String hoTen){ 
            String[] parts = hoTen.split("\\s+");
            StringBuilder sb = new StringBuilder("");
            for (String part : parts){
                if (!part.isEmpty()){   
                    sb.append(part.substring(0,1).toUpperCase() + part.substring(1).toLowerCase() + " ");
                }
            }
            this.hoTen = sb.toString().trim(); 
        }
        public void setLop(String lop){ this.lop = lop; }
        public void setNgaySinh(String ngaySinh){ this.ngaySinh = ngaySinh; }
        public void setGpa(float gpa){ this.gpa = gpa; }
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (t-- > 0){
            SinhVien sv = new SinhVien();
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
