import java.util.Scanner;
public class J04015 {
    public static class GiaoVien {
        private String hoTen, chucVu, maNgach;
        private long luongCoBan;
        private int bacLuong, phuCap;
        public GiaoVien(String maNgach, String hoTen, long luongCoBan){
            this.setMaNgach(maNgach);
            this.setPhuCap();
            this.hoTen = hoTen;
            this.luongCoBan = luongCoBan;
        }
        public void setMaNgach(String maNgach) {
            this.maNgach = maNgach;
            this.chucVu = maNgach.substring(0,2);
            this.bacLuong = Integer.parseInt(maNgach.substring(2));
        }
        public void setPhuCap() {
            switch (this.chucVu){
                case "HT": this.phuCap = 2000000; break;
                case "HP": this.phuCap = 900000; break;
                case "GV": this.phuCap = 500000; break;
            }
        }
        public long tinhLuong() {
            return this.luongCoBan * this.bacLuong + this.phuCap;
        }
        @Override
        public String toString() {
            return this.maNgach + " " + this.hoTen + " " + this.bacLuong + " " + this.phuCap + " " + this.tinhLuong();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String maNgach = sc.nextLine();
        String hoTen = sc.nextLine();
        long luongCoBan = sc.nextLong();
        GiaoVien gv = new GiaoVien(maNgach, hoTen, luongCoBan);
        System.out.println(gv);
        sc.close();
    }
}