import java.util.*;
public class J05005 {
    public static class SinhVien{
        private String maSV, hoTen, lop, ngaySinh;
        private float gpa;
        private static int count = 0;
        public SinhVien(){
            this.maSV = "B20DCCN" + String.format("%03d", ++count);
            this.hoTen = "";
            this.lop = "";
            this.ngaySinh = "";
            this.gpa = 0.0f;
        }
        
        public void setHoTen(String hoTen){
            String[] tenChuaChuanHoa = hoTen.split("\\s+");
            StringBuilder tenChuanHoa = new StringBuilder();
            for (String res: tenChuaChuanHoa){
                if (!res.isEmpty()){
                    tenChuanHoa.append(res.substring(0,1).toUpperCase() + res.substring(1).toLowerCase() + " ");
                }   
            }
            this.hoTen = tenChuanHoa.toString().trim();
        }

        public void setNgaySinh(String ngaySinh){
            String[] ngaySinhCu = ngaySinh.split("/");
            StringBuilder ngaySinhMoi = new StringBuilder();
            if (ngaySinhCu[0].length() == 1) ngaySinhMoi.append("0").append(ngaySinhCu[0]);
            else ngaySinhMoi.append(ngaySinhCu[0]);
            ngaySinhMoi.append("/");
            if (ngaySinhCu[1].length() == 1) ngaySinhMoi.append("0").append(ngaySinhCu[1]);
            else ngaySinhMoi.append(ngaySinhCu[1]);
            ngaySinhMoi.append("/");
            ngaySinhMoi.append(ngaySinhCu[2]);
            this.ngaySinh = ngaySinhMoi.toString();
        }
        public void setLop(String lop){ this.lop = lop; }
        public void setGpa(float gpa){ this.gpa = gpa; }

        @Override
        public String toString(){
            return String.format("%s %s %s %s %.2f", this.maSV, this.hoTen, this.lop, this.ngaySinh, this.gpa);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> ds = new ArrayList<>();
        while (t-- > 0){
            SinhVien sv = new SinhVien();
            sv.setHoTen(sc.nextLine());
            sv.setLop(sc.nextLine());
            sv.setNgaySinh(sc.nextLine());
            sv.setGpa(Float.parseFloat(sc.nextLine()));
            ds.add(sv);
        }
        sc.close();
        //  Sắp xếp gpa giảm dần
        Collections.sort(ds, (d1,d2) -> Float.compare(d2.gpa, d1.gpa));
        for (SinhVien sv: ds){
            System.out.println(sv);
        }
    }

}
