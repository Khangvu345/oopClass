import java.util.*;
import java.io.*;

public class J07037 {
    public static class DoanhNghiep {
        private String ma;
        private String ten;
        private int soSinhVienNhan;

        public DoanhNghiep(String ma, String ten, int soSinhVienNhan) {
            this.ma = ma;
            this.ten = ten;
            this.soSinhVienNhan = soSinhVienNhan;
        }

        public String getMa() {
            return ma;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + soSinhVienNhan;
        }
    }

    public static void main(String[] args) {
        File file = new File("DN.in");
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        try (Scanner sc = new Scanner(file)) {
            int t = Integer.parseInt(sc.nextLine().trim());
            while (t-- > 0) {
                String ma = sc.nextLine().trim();
                String ten = sc.nextLine().trim();
                int soSinhVienNhan = Integer.parseInt(sc.nextLine().trim());
                DoanhNghiep doanhNghiep = new DoanhNghiep(ma, ten, soSinhVienNhan);
                ds.add(doanhNghiep);
            }
            // SO SÁNH cơ bản bằng hàm sort với đối tượng. Cần truyền vào 2 tham số: 1 là danh sách cần so sánh, 2 là logic so sánh
            Collections.sort(ds, new Comparator<DoanhNghiep>() {
                @Override
                public int compare(DoanhNghiep d1, DoanhNghiep d2) { // Đây là hàm logic so sánh 
                    return d1.getMa().compareTo(d2.getMa()); // Đây là phép so sánh
                }
            });

            for (DoanhNghiep doanhNghiep : ds) {
                System.out.println(doanhNghiep);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
