import java.util.*;
public class J05009 {
    public static class ThiSinh{
        private int maTS;
        private String  hoTen, ngaySinh;
        private float diem1, diem2, diem3;
        private static int count = 0;
        public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
            count++;
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.diem1 = diem1;
            this.diem2 = diem2;
            this.diem3 = diem3;
            this.maTS = count;
        }
        public float getDiemThi(){
            return diem1 + diem2 + diem3;
        }
        @Override 
        public String toString(){
            return String.format("%d %s %s %f", maTS, hoTen, ngaySinh, getDiemThi());
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> ds = new ArrayList<>();
        while (t-- > 0){
            String hoTen = sc.nextLine();
            String ngaySinh = sc.nextLine();
            float diem1 = Float.parseFloat(sc.nextLine());
            float diem2 = Float.parseFloat(sc.nextLine());
            float diem3 = Float.parseFloat(sc.nextLine());
            ThiSinh ts = new ThiSinh(hoTen, ngaySinh, diem1, diem2, diem3);
            ds.add(ts);
        }
        Collections.sort(ds, (a, b) -> {
            if (a.getDiemThi() != b.getDiemThi()){
                return Float.compare(b.getDiemThi(), a.getDiemThi());
            }
            return a.maTS - b.maTS;
        });
        float max = ds.get(0).getDiemThi();
        for (ThiSinh ts : ds){
            if (ts.getDiemThi() == max){
                System.out.println(ts);
            }
        }
    }
    
}
