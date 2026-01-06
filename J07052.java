import java.util.*;
import java.io.*;
public class J07052 {
    public static class ThiSinh{
        private String hoten, maThiSinh;
        private float diemToan, diemLy, diemHoa;
        private float diemUuTien;
        public ThiSinh(String maThiSinh, String hoTen, float diemToan, float diemLy, float diemHoa){
            this.maThiSinh = maThiSinh;
            this.hoten = this.setHoTen(hoTen);
            this.diemToan = diemToan;
            this.diemLy = diemLy;
            this.diemHoa = diemHoa;
            this.diemUuTien = this.setDiemUuTien();
        }
        // Xử lý yêu cầu chuẩn hóa tên nếu độ dài tên > 3 từ.
        public String setHoTen(String hoTen){
            String[] tenChuaChuanHoa = hoTen.split("\\s+");
            StringBuilder tenChuanHoa = new StringBuilder();
            for (String res : tenChuaChuanHoa){
                if (!res.isEmpty()){ // Bổ sung để loại bỏ lỗi tạo bởi khoảng trắng
                    tenChuanHoa.append(res.substring(0,1).toUpperCase() + res.substring(1).toLowerCase() + " ");
                }
            }
            return tenChuanHoa.toString().trim();
        }

        public float setDiemUuTien(){
            String maKhuVuc = this.maThiSinh.substring(0,3);
            switch (maKhuVuc){
                case "KV1": return 0.5f;
                case "KV2": return 1.0f;
                case "KV3": return 2.5f;
                default: return 0.0f;
            }
        }

        public float diemXetTuyen(){
            return this.diemToan * 2 + this.diemLy + this.diemHoa + this.diemUuTien;
        }
        // Xử lý yêu cầu nếu là số nguyên thì in số nguyên, còn là số thực thì in số thực chỉ lấy 1 số sau dấu phẩy
        public static String formatDiem(float diem){
            if (diem == (int) diem) return String.format("%d", (int) diem); // Chú ý logic format ở đây vì đã chuyển sang số nguyên nên phải nhận %d
            return String.format("%.1f", diem);
        }
        @Override
        public String toString(){
            return String.format("%s %s %s %s", this.maThiSinh, this.hoten, formatDiem(this.diemUuTien), formatDiem(this.diemXetTuyen()));
        }
    }
    public static void main(String[] args){
        File file = new File("THISINH.in");
        ArrayList<ThiSinh> ds = new ArrayList<>();
        try(Scanner sc = new Scanner(file)){
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0){
                String maThiSinh = sc.nextLine();
                String hoTen = sc.nextLine();
                float diemToan = Float.parseFloat(sc.nextLine());
                float diemLy = Float.parseFloat(sc.nextLine());
                float diemHoa = Float.parseFloat(sc.nextLine());
                ThiSinh ts = new ThiSinh(maThiSinh, hoTen, diemToan, diemLy, diemHoa);
                ds.add(ts);
            }
            // Sau khi duyệt hết danh sách thí sinh thì nhận số chỉ tiêu
            int chiTieu = Integer.parseInt(sc.nextLine());

            //Sắp xếp danh sách sv theo điểm và cuối cùng là theo mã thí sinh
            Collections.sort(ds, (d1, d2) -> {
                if (d1.diemXetTuyen() != d2.diemXetTuyen()){
                    return Float.compare(d2.diemXetTuyen(), d1.diemXetTuyen());
                }
                return d1.maThiSinh.compareTo(d2.maThiSinh);
            });

            //Tìm điểm chuẩn. Nếu chỉ tiêu lớn hơn số thí sinh thì lấy điểm của thí sinh cuối cùng
            // Ngược lại lấy điểm của thí sinh ở chỉ tiêu
            float diemChuan = 0;
            if (chiTieu > ds.size()) diemChuan = ds.get(ds.size() - 1).diemXetTuyen();
            else diemChuan = ds.get(chiTieu - 1).diemXetTuyen();

            // In ra điểm chuẩn với format theo đề bài
            System.out.println(String.format("%.1f", diemChuan)); 
            
            // In ra danh sách thí sinh theo yêu cầu
            for (ThiSinh ts : ds){
                String trangThai = (ts.diemXetTuyen() >= diemChuan) ? "TRUNG TUYEN" : "TRUOT"; // Toán tử điều kiện rút gọn
                System.out.println(ts + " " + trangThai);
            }
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
